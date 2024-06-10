FROM openjdk:21
VOLUME /tmp
EXPOSE 8002
ARG JAR_FILE=target/kvk_verification-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]