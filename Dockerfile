FROM openjdk:17
EXPOSE 8080
ADD target/springboot-github-actions-demo.jar springboot-github-actions-demo.jar
ENTRYPOINT ["java","-jar","/springboot-github-actions-demo.jar"]