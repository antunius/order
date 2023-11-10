# Use the official OpenJDK 19 image as a base image
FROM openjdk:21-slim

# Set the working directory
WORKDIR /app

COPY . .

RUN ./gradlew clean build


# Copy the necessary files to the container
COPY build/libs/order-v1.jar /app/order-v1.jar

# Command to run the application
CMD ["java", "-jar", "order-v1.jar"]
