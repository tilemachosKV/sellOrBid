# Use Alpine Linux as the base image
FROM alpine:3.21.3

# Install OpenJDK 21 and necessary tools
RUN apk add --no-cache openjdk21-jdk

# Set the working directory
WORKDIR /backendapp

# Copy the JAR file into the container
COPY . .

# Expose the port the app runs on
EXPOSE 4201

# Set the command to run the application
CMD [ "./mvnw", "spring-boot:run" ]