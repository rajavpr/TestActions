FROM zulu-openjdk:17-latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} TestActions-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/TestActions-0.0.1-SNAPSHOT.jar"]