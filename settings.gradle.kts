rootProject.name = "kotlin-modules"

include(":app")
include(":shape")

project(":app").projectDir = File("$rootDir/app")
project(":shape").projectDir = File("$rootDir/shape")