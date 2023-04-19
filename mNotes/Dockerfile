# Build Stage
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

# Run Stage
FROM openjdk:17
COPY ./target/mNotes-0.0.1-SNAPSHOT.jar mNotes.jar
CMD ["java","-jar","mNotes.jar"]