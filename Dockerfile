# Utilisation de l'image eclipse-temurin:21-jre-alpine comme base
FROM eclipse-temurin:21-jdk-alpine

# Installation de git et Maven
RUN apk add --no-cache git maven

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copy the pom.xml file
COPY pom.xml .

# Copier le fichier .env
COPY .env .

# Copy your source code
COPY src /app/src

# Construire le projet avec Maven
RUN mvn package -DskipTests

# Exposer le port sur lequel l'application s'exécutera
EXPOSE 8085

CMD source .env && mvn clean install exec:java