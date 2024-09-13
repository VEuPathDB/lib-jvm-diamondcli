import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.dokka.versioning.VersioningPlugin
import org.jetbrains.dokka.versioning.VersioningConfiguration

plugins {
  kotlin("jvm") version "2.0.20"
  id("org.jetbrains.dokka") version "1.9.20"
  `maven-publish`
}

group = "org.veupathdb.lib"
version = "0.3.0"

buildscript {
  dependencies {
    classpath("org.jetbrains.dokka:versioning-plugin:1.9.20")
  }
}

repositories {
  mavenCentral()
  maven {
    name = "GitHubPackages"
    url  = uri("https://maven.pkg.github.com/veupathdb/*")
    credentials {
      username = if (extra.has("gpr.user")) extra["gpr.user"] as String? else System.getenv("GITHUB_USERNAME")
      password = if (extra.has("gpr.key")) extra["gpr.key"] as String? else System.getenv("GITHUB_TOKEN")
    }
  }
}

dependencies {
  api("org.veupathdb.lib:jackson-singleton:3.2.0")
  api("org.slf4j:slf4j-api:2.0.16")

  implementation("io.foxcapades.kt:cli-builder:0.6.0")

  dokkaHtmlPlugin("org.jetbrains.dokka:versioning-plugin:1.9.20")

  testImplementation("org.mockito:mockito-junit-jupiter:5.13.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:5.4.0")
  testImplementation("org.mockito:mockito-core:5.13.0")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()

  testLogging {
    events(
      TestLogEvent.PASSED,
      TestLogEvent.FAILED,
      TestLogEvent.SKIPPED,
    )
  }
}

kotlin {
  jvmToolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
    vendor.set(JvmVendorSpec.AMAZON)
  }
}

tasks.dokkaHtml {
  val featVersion = (version as String).substring(0, (version as String).lastIndexOf('.')) + ".0"
  outputDirectory.set(file("docs/dokka/v$featVersion"))

  pluginConfiguration<VersioningPlugin, VersioningConfiguration> {
    version = "v$featVersion"
    olderVersionsDir = file("docs/dokka")
  }
}

publishing {
  repositories {
    maven {
      name = "GitHub"
      url  = uri("https://maven.pkg.github.com/veupathdb/lib-jvm-diamondcli")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }
  }

  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      pom {
        name.set("JaxRS Container Core Library")
        description.set("Provides base methods, endpoints, server setup, and utilities for use in containerized VEuPathDB JaxRS based applications.")
        url.set("https://github.com/VEuPathDB/lib-jvm-diamondcli")
        developers {
          developer {
            id.set("epharper")
            name.set("Elizabeth Paige Harper")
            email.set("foxcapades.io@gmail.com")
            url.set("https://github.com/foxcapades")
            organization.set("VEuPathDB")
          }
        }
        scm {
          connection.set("scm:git:git://github.com/VEuPathDB/lib-jvm-diamondcli.git")
          developerConnection.set("scm:git:ssh://github.com/VEuPathDB/lib-jvm-diamondcli.git")
          url.set("https://github.com/VEuPathDB/lib-jvm-diamondcli")
        }
      }
    }
  }
}
