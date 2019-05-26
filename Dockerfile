FROM openjdk:8-jdk-slim
VOLUME /tmp
ADD build/libs/inventory-service-0.1.0.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
