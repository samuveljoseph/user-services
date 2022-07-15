FROM openjdk:8
EXPOSE 8081
ADD target/user-services-0.0.1.jar user-services-0.0.1.jar
ENTRYPOINT ["java","-jar","/user-services-0.0.1.jar"]