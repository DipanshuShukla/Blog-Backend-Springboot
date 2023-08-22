FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:20-jdk-slim
COPY --from=build /target/Nordic-Rose-0.0.1-SNAPSHOT.jar Nordic-Rose.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Nordic-Rose.jar"]