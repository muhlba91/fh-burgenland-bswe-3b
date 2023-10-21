FROM openjdk:22-slim-bullseye

RUN mkdir -p /tmp/myBuild/
COPY ./build/libs/bswe3b-0.0.1-SNAPSHOT.jar /tmp/myBuild/bswe3b.jar

EXPOSE 8080

CMD ["java", "-jar", "/tmp/myBuild/bswe3b.jar"]
