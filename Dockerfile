FROM openjdk:17-jdk-buster

LABEL authors="Vardan"

ENV DIR=/usr/local/app

COPY /build/libs/simple-security-0.0.1.jar $APP_HOME_DIR/simple-security-service.jar

WORKDIR $APP_HOME_DIR

EXPOSE 5777

ENTRYPOINT ["java", "-Xms1024m", "-Xmx2048m", "-jar", "simple-security-service.jar"]
