
allprojects {

	repositories {
		mavenLocal()
		google()
		mavenCentral()
		maven {
			url = uri("https://nexus.ecg.vet/repository/maven-releases/")
			credentials {
				username = providers.gradleProperty("nexus_user").orNull
				password = providers.gradleProperty("nexus_password").orNull
			}
		}
	}

	group = "io.ygdrasil"
	version = System.getenv("VERSION")?.takeIf { it.isNotBlank() } ?: "v27.0.5"
}


