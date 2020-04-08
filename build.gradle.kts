import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask


plugins {
  kotlin("jvm") version "1.3.71" apply false
  id("org.gradle.java.experimental-jigsaw") version "0.1.1"
  id("com.github.johnrengelman.shadow") version "5.2.0" apply false
  id("com.github.ben-manes.versions") version "0.28.0"
}

subprojects {

  group = "io.github.vihangpatil.kotlin.modules"
  version = "1.0.0-SNAPSHOT"

  repositories {
    mavenCentral()
    jcenter()
  }
}

fun isNonStable(version: String): Boolean {
  val regex = "^[0-9,.v-]+$".toRegex()
  val isStable = regex.matches(version)
  return isStable.not()
}

tasks.withType<DependencyUpdatesTask> {
  // Example 1: reject all non stable versions
  rejectVersionIf {
    isNonStable(candidate.version)
  }

  // Example 2: disallow release candidates as upgradable versions from stable versions
  rejectVersionIf {
    isNonStable(candidate.version) && !isNonStable(currentVersion)
  }

  // Example 3: using the full syntax
  resolutionStrategy {
    componentSelection {
      all {
        if (isNonStable(candidate.version) && !isNonStable(currentVersion)) {
          reject("Release candidate")
        }
      }
    }
  }
}