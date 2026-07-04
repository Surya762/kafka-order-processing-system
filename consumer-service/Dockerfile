FROM eclipse-temurin:25-jdk
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*
WORKDIR /app
COPY . .
RUN mvn -q -DskipTests package
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/consumer-service-1.0-SNAPSHOT.jar"]
