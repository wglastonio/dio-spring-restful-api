FROM openjdk:17-oracle
WORKDIR /usr/local/myApps/
COPY restfulApi-0.0.1-SNAPSHOT.jar restful-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restful-api.jar"]