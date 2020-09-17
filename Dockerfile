# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Add the application's jar to the container
COPY target/statistics-0.0.1-SNAPSHOT.jar statistics-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=test", "statistics-0.0.1-SNAPSHOT.jar"]
