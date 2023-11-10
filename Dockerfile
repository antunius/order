# Use the official OpenJDK 19 image as a base image
FROM amazoncorretto:21.0.1-al2023-headless

# Set the working directory
WORKDIR /app

# Copy the necessary files to the container
COPY build/libs/order-v1.jar /app/order-v1.jar
# Expose the port that your application will run on
EXPOSE 80

# Command to run the application
CMD ["java", "-jar", "order-v1.jar"]
