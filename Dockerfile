

FROM adoptopenjdk/maven-openjdk11
ADD target/springboot-cassandra.jar spring-cass.jar
ENTRYPOINT ["java", "-jar", "spring-cass.jar" ]