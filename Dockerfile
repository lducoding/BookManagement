FROM openjdk:17.0.1
COPY build/libs/book-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","app.jar"]