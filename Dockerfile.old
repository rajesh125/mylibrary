# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Add the application's jar to the container
COPY target/kitchenbob-*.jar kitchenbob.jar

# Run the jar file 
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=test", "kitchenbob.jar"]
