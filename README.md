## Example POM file - 
# Project Dependencies 
```
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.0.5</version>
    <relativePath/>
  </parent>

  <groupId>com.example</groupId>
  <artifactId>demo</artifactId>
  <version>0.0.1-SNAPSHOT</version>

  <properties>
    <java.version>Version - 17</java.version>
  </properties>

  <dependencies>

    <!-- Core web and REST support -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- For data access and JPA/Hibernate -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- PostgreSQL driver -->
    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
    </dependency>

    <!-- (Optional) Spring Boot Actuator -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

    <!-- (Optional) For testing -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>

  </dependencies>

  <build>
    <plugins>
      <!-- Spring Boot Maven Plugin: helps package as a self-contained jar -->
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>

```

# Setting Up Your Development Environment on macOS

1. If you don't have Java installed on your system.
`brew install openjdk@17`

2. For the system Java wrappers to find this JDK , we have to symlink it with - 

`https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html`

And Download the java 17.0.12 installer for your platform and then run it and follow instructions.

![alt text](/public/assets/image.png)

