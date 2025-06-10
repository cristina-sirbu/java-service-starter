# Use an OpenJDK image
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.21-1.1748944342

# Set workdir
WORKDIR /app

# Copy build artifacts
COPY target/miniapollo-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
