# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build files
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Copy the application source
COPY src ./src

# Build the application
RUN ./mvnw clean install

# Copy the built jar file into the container
COPY target/billboardusagesystem-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
