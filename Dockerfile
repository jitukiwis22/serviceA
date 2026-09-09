FROM eclipse-temurin:17-jre

WORKDIR /app
EXPOSE 9091

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
