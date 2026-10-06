FROM eclipse-temurin:17-jre
WORKDIR /docker
COPY target/*.jar DOCJEN-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "DOCJEN-0.0.1-SNAPSHOT.jar"]