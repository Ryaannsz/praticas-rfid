# Usando a imagem base do OpenJDK 17 Alpine
FROM openjdk:17-jdk-alpine

ENV MYSQL_HOST=sql.freedb.tech
ENV MYSQL_PORT=3306
ENV MYSQL_USER=freedb_roote
ENV MYSQL_PASSWORD=!tBrSuu3ajn%QfB
ENV MYSQL_DB=freedb_praticasiot

# Instalar Maven e outras dependências necessárias
RUN apk update && apk add --no-cache maven

# Definir diretório de trabalho
WORKDIR /usr/local/service
# Verificar conteúdo do diretório de trabalho
RUN ls -l /usr/local/service

# Copiar o arquivo pom.xml e o diretório src
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src

RUN ls -l /usr/local/service  # Verificar se os arquivos foram copiados corretamente

# Rodar o Maven para compilar o projeto
RUN mvn package -DskipTests

# Copiar o arquivo JAR gerado para o diretório de destino
COPY target/*.jar /app/app.jar

# Definir o comando para rodar a aplicação
CMD ["java", "-jar", "/app/app.jar"]