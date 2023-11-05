FROM openjdk:20-slim

COPY build/libs/bswe3b.jar /app.jar

EXPOSE 8080/tcp

CMD ["java", "-jar", "/app.jar"]
