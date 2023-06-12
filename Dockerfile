FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/spring-boot-github-action-repo.jar spring-boot-github-action-repo.jar
CMD ["java", "-jar", "spring-boot-github-action-repo.jar"]
