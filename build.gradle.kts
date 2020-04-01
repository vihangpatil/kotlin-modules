import java.net.URI

plugins {
  kotlin("jvm") version "1.3.70" apply false
  id("org.gradle.java.experimental-jigsaw") version "0.1.1"
  id("project-report")
  id("com.github.johnrengelman.shadow") version "5.2.0" apply false
  id("com.github.ben-manes.versions") version "0.20.0"
}

subprojects {

  group = "io.github.vihangpatil.kotlin.modules"
  version = "1.0.0-SNAPSHOT"

  repositories {
    mavenCentral()
    jcenter()
    maven { url = URI("https://repository.jboss.org/nexus/content/repositories/releases/") }
    maven { url = URI("https://maven.repository.redhat.com/ga/") }
    maven { url = URI("http://clojars.org/repo/") }
  }
}

