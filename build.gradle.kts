plugins {
    kotlin("jvm") version "2.3.0-Beta2"
}

group = "dev.koloja.granite"
version = project.property("granite_version").toString()

allprojects {
    group = rootProject.group
    version = rootProject.version

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
}