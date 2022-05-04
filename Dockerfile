FROM openjdk:11
ADD out/artifacts/microservice_jar/microservice.jar microservice.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","microservice.jar"]