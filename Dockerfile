FROM openjdk:17.0.2-jdk
EXPOSE 8081
ADD target/Springrest-demo.jar Springrest-demo.jar
ENTRYPOINT ["java","-jar","Springrest-demo.jar"]
