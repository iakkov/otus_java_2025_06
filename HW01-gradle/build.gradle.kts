import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "ru.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation("com.google.guava:guava:33.4.8-jre")
}


tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("gradleStudy")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        manifest {
            attributes("Main-Class" to "ru.project.HelloOtus")
        }
    }

    build {
        dependsOn(shadowJar)
    }
}