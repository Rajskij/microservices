FROM java:8
WORKDIR /
ADD target/apigateway-1.0-SNAPSHOT.jar //
EXPOSE 8089 8089
ENTRYPOINT [ "java", "-jar", "/apigateway-1.0-SNAPSHOT.jar"]
