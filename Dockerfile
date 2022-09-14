FROM openjdk:8
EXPOSE 8080
ADD target/springboot-githubaction-example.jar springboot-githubaction-example.jar
ENTRYPOINT ["java","-jar","/springboot-githubaction-example.jar"]