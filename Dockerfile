FROM openjdk:17-alpine
COPY build/libs/rido-0.0.1-SNAPSHOT.jar /rido-app.jar
CMD ["java", "-jar", "/rido-app.jar"]
