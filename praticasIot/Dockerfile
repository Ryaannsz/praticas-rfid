FROM maven:3.6.3-jdk-11-slim AS builder
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM openjdk:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY --from=builder /app/target/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]