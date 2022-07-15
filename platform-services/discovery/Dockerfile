FROM maven:3.6.0-jdk-8-alpine as build

VOLUME /tmp
COPY target/discovery*.jar discovery.jar
EXPOSE 8761 8761
ENTRYPOINT ["java","-jar","/discovery.jar"]