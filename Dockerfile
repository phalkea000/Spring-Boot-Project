FROM openjdk:17
EXPOSE 8080
ADD target/sprinfdocker.jar sprinfdocker.jar
ENTRYPOINT [ "java","-jar","/sprinfdocker.jar" ]