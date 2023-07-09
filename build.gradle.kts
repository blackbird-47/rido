plugins {
	java
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "app"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	gradlePluginPortal()
	mavenLocal()
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.boot:spring-boot-starter-parent:3.1.1")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
	testImplementation("org.projectlombok:lombok:1.18.22")
	compileOnly("org.projectlombok:lombok:1.18.26")
	annotationProcessor("org.projectlombok:lombok:1.18.26")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
