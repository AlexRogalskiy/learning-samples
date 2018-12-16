#!/bin/sh
mvn clean package && docker build -t de.rieckpil.learning/java-ee-keycloak-sample .
docker rm -f java-ee-keycloak-sample || true && docker run -d -p 8080:8080 -p 4848:4848 --name java-ee-keycloak-sample de.rieckpil.learning/java-ee-keycloak-sample