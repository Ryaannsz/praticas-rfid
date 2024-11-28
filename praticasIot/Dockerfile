FROM openjdk:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY target/*.jar /app/app.jar


ENV MYSQL_HOST=db
ENV MYSQL_PORT=3306

CMD [  "java", "-jar", "/app/app.jar" ]