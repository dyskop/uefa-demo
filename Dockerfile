FROM openjdk:17-alpine
COPY ./build/libs/uefa-demo-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]