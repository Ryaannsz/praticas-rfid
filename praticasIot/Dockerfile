
FROM maven:3.9.4-openjdk-17-slim AS builder


WORKDIR /app


COPY . /app


RUN mvn clean package -DskipTests


FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY --from=builder /app/target/*.jar /app/app.jar

# Comando para rodar o aplicativo
CMD ["java", "-jar", "/app/app.jar"]