FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]