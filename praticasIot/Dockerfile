# Usando a imagem base do OpenJDK 17 Alpine
FROM openjdk:17-jdk-alpine

# Instalar Maven e outras dependências necessárias
RUN apk update && apk add --no-cache maven

# Definir diretório de trabalho
WORKDIR /usr/local/service

# Copiar o arquivo pom.xml e o diretório src
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src

# Rodar o Maven para compilar o projeto
RUN mvn package -DskipTests

# Copiar o arquivo JAR gerado para o diretório de destino
COPY target/*.jar /app/app.jar

# Definir o comando para rodar a aplicação
CMD ["java", "-jar", "/app/app.jar"]
