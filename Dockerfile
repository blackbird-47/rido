FROM openjdk:17-alpine
ADD ./rido-app.jar /rido-app.jar
CMD ["java", "-jar", "/rido-app.jar"]
