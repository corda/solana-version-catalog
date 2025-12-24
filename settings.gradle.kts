rootProject.name = "solana-version-catalog"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    if (
      providers.gradleProperty("savaGithubPackagesUsername").isPresent &&
      providers.gradleProperty("savaGithubPackagesPassword").isPresent
    ) {
      maven {
        name = "savaGithubPackages"
        url = uri("https://maven.pkg.github.com/sava-software/sava-build")
        credentials(PasswordCredentials::class)
      }
    }
//  includeBuild("../sava-build")
    maven {
      url = uri("https://software.r3.com/artifactory/corda-dependencies")
      credentials {
        username = System.getenv("CORDA_ARTIFACTORY_USERNAME")
        password = System.getenv("CORDA_ARTIFACTORY_PASSWORD")
      }
    }
    mavenLocal()
  }
}

plugins {
  id("software.sava.build") version "21.3.3-j17-1"
}

include("solana-version-catalog")
