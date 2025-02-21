FROM openjdk:23-jdk
COPY target/spring-app.jar /app/spring-app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "spring-app.jar"]
