#FROM adoptopenjdk:11-jre-hotspot
##ARG JAR_FILE=*.jar
##ADD ${JAR_FILE} application.jar
#COPY target/springboot-cassandra.jar spring-cassandra.jar
#ENTRYPOINT ["java", "-jar", "/spring-cassandra.jar"]

#FROM maven:3.6.0-jdk-11-slim
#ARG JAR_FILE
#COPY target/${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#
#FROM openjdk:11
#EXPOSE 8080
#ARG JAR_FILE=target/springboot-cassandra.jar
#ADD ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:11
ADD target/springboot-cassandra.jar spring-cass.jar
ENTRYPOINT ["java", "-jar", "spring-cass.jar" ]