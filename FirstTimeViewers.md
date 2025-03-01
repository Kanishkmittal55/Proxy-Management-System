# Spring Boot and Its Build Tools
In the Java world (and specifically in Spring Boot projects), you generally have two main build tool choices:

## Maven

1. Uses a file called pom.xml (Project Object Model).
2. XML-based, widely used and well-documented in the Java community.
3. Dependencies and plugin configurations go under <dependencies> and <build> sections in pom.xml.

## Gradle

Uses a file called build.gradle (and sometimes settings.gradle).
Groovy or Kotlin DSL-based, popular for being more concise than Maven.
Dependencies go under a dependencies { ... } block.

### In Node /React:

- package.json is your main config for dependencies and scripts.
- Yarn or npm do the actual fetching and resolution.

### In Spring Boot (*Maven*):

pom.xml is somewhat analogous to package.json.
The version management, plugin management, and dependency resolution happen via Maven coordinates (groupId, artifactId, version).

### In Spring Boot (Gradle):

The build.gradle (or build.gradle.kts) is your configuration file.
Same idea: you declare dependencies in a special DSL, e.g. implementation("org.springframework.boot:spring-boot-starter-web").

## How Spring Boot Handles Versions ?

2.1 Spring Boot Starters 

Spring Boot has a concept of Starters—preconfigured dependency bundles that make it easy to get up and running with common functionality. For example:

- spring-boot-starter-web → Bundles all you need for building RESTful APIs (Spring MVC, embedded Tomcat server, JSON, etc.).
- spring-boot-starter-data-jpa → Bundles JPA + Hibernate + configuration for connecting to relational databases.
- spring-boot-starter-actuator → Adds monitoring endpoints.
- spring-boot-starter-test → Adds common libraries for testing (JUnit, Mockito, etc.).

## Key Points / Frequently Asked Questions
- Do I have to keep track of hundreds of library versions manually?
**Ans** - Usually no. Spring Boot’s BOM (Bill of Materials) or parent POM does that for you for the most common libraries.

- What if my database is something else (MySQL, Oracle, etc.)?
**Ans** - Then you swap the driver dependency. For MySQL, you add <artifactId>mysql-connector-j</artifactId>. For Oracle, an Oracle JDBC driver, etc.

- How do I choose Maven vs. Gradle?
**Ans** - Maven: More traditional, more widely used in older enterprise contexts, huge ecosystem of plugins.
Gradle: Often considered more modern, faster in some cases, more flexible.
If you’re new, either is fine—Maven might be simpler to learn first because many tutorials use it.

- Is there an npm install equivalent in Maven/Gradle?
**Ans** - With Maven, you typically do mvn clean install or mvn package.
With Gradle, you do gradle build or gradle assemble.
These commands fetch dependencies from remote repositories (like Maven Central) and put them in your local cache.

- How do I specify a specific version of a library outside the Spring Boot curated list?
**Ans** - In Maven, add <version>X.Y.Z</version> in your <dependency> block.
In Gradle, do implementation("group:artifact:version").

- What about JDK versions?
**Ans** - In your pom.xml, you have <java.version>17</java.version> or in build.gradle, sourceCompatibility = '17'.
Spring Boot 3.0+ requires Java 17 or above (LTS).