FROM maven:3-eclipse-temurin-11-alpine
WORKDIR /appmavenjenkins
ADD . /appmavenjenkins
EXPOSE 3000
CMD jenkins/scripts/deliver.sh
