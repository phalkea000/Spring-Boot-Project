FROM openjdk:17
EXPOSE 8080
ADD target/dockerexample.jar dockerexample.jar
ENTRYPOINT [ "java","-jar","/dockerexample.jar" ]