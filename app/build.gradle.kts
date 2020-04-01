import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
  application
  kotlin("jvm")
  id("org.gradle.java.experimental-jigsaw")
  id("com.github.johnrengelman.shadow")
  idea
}

dependencies {

  implementation(project(":shape"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("ch.qos.logback:logback-classic:1.2.3")

  testImplementation(kotlin("test"))
  testRuntimeOnly("org.hamcrest:hamcrest-all:1.3")
}

// FIXME: I'm unable to apply `ext.moduleName` in `.kts`. So, reverting to `build.gradle` just for `:app`.
val moduleName by extra { "io.github.vihangpatil.kotlin.modules.app" }

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

application {
  mainClassName = "io.github.vihangpatil.kotlin.modules.app.AppKt"
}

tasks.withType<ShadowJar> {
  mergeServiceFiles()
  archiveClassifier.set("uber")
  archiveVersion.set("")
}

// apply(from = "../module.gradle")
