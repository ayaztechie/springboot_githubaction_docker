FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-guihubaction.jar springboot-docker-guihubaction.jar
ENTRYPOINT ["java","-jar","/springboot-docker-guihubaction.jar"]