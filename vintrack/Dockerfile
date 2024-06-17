FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/vintrack-0.0.1.jar
COPY ${JAR_FILE} vintrack.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "vintrack.jar"]