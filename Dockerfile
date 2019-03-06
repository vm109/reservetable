FROM alpine:edge
MAINTAINER venkata mangina
RUN apk add --no-cache openjdk8
COPY target/reservetable-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://app_db:27017/reservetable", "-jar", "./reservetable-0.0.1-SNAPSHOT.jar"]