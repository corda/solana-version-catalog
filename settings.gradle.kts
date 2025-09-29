pluginManagement {
  repositories {
    gradlePluginPortal()
    maven {
      name = "savaGithubPackages"
      url = uri("https://maven.pkg.github.com/sava-software/sava-build")
      credentials(PasswordCredentials::class)
    }
    mavenLocal()
  }
}

plugins {
  id("software.sava.build") version "0.1.36-j17-1"
}

rootProject.name = "solana-version-catalog"

include("solana-version-catalog")
