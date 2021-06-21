FROM openjdk:8
ADD target/spring-boot-docker-plugin-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]