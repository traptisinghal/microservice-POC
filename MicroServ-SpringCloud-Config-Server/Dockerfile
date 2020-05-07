FROM openjdk:8
ADD target/springboot-docker-cassandra.jar springboot-docker-cassandra.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springboot-docker-cassandra.jar"]