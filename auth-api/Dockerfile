# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy WAR file to container
COPY target/auth-api.jar app.jar
# Expose the port your app runs on (usually 8080)
EXPOSE 8082

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]