FROM openjdk:11-jdk-slim

WORKDIR /app

COPY target/tm-app-1.0-SNAPSHOT.jar /app/

EXPOSE 8080

CMD ["java", "-jar", "tm-app-1.0-SNAPSHOT.jar"]
