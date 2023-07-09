FROM openjdk
ADD ./rido-app.jar /rido-app.jar
CMD ["java", "-jar", "/rido-app.jar"]
