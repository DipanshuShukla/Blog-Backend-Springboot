FROM openjdk:20-jdk-slim
EXPOSE 8080
ADD /target/Nordic-Rose-0.0.1-SNAPSHOT.jar Nordic-Rose.jar
ENTRYPOINT ["java", "-jar", "Nordic-Rose.jar"]