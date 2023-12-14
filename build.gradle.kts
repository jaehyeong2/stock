import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.20"
	kotlin("plugin.spring") version "1.9.20"
	kotlin("plugin.jpa") version "1.9.20"
	kotlin("kapt") version "1.9.10"
}

group = "jjfactory"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
	maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-batch")

	implementation("org.springframework.boot:spring-boot-starter-data-redis")

//	implementation("com.linecorp.kotlin-jdsl:spring-data-kotlin-jdsl-starter-jakarta:3.2.0")

	implementation("com.linecorp.kotlin-jdsl:jpql-dsl:3.2.0")
	implementation("com.linecorp.kotlin-jdsl:spring-data-jpa-support:3.2.0")
	implementation("com.linecorp.kotlin-jdsl:jpql-render:3.2.0")

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	implementation("org.mapstruct:mapstruct:1.5.5.Final")
	kapt("org.mapstruct:mapstruct-processor:1.5.5.Final")
	kaptTest("org.mapstruct:mapstruct-processor:1.5.5.Final")
}


tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
