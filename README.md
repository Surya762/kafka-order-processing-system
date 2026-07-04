# Kafka Order Processing System

# 🚀 Kafka Order Processing System

![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5-brightgreen)
![Kafka](https://img.shields.io/badge/Apache-Kafka-black)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-red)
![GitHub Actions](https://img.shields.io/badge/CI-GitHubActions-success)

A real-time event-driven Order Processing System built using Spring Boot, Apache Kafka, Docker, and Maven.

## 🚀 Features

- Spring Boot REST API
- Apache Kafka Producer
- Apache Kafka Consumer
- Docker Compose
- Validation using Jakarta Validation
- Global Exception Handling
- GitHub Actions CI

## 🛠 Tech Stack

- Java 25 LTS
- Spring Boot 3.5
- Apache Kafka
- Maven
- Docker
- Lombok

## 📁 Project Structure

```
kafka-order-processing-system
│
├── producer-service
├── consumer-service
├── docker-compose.yml
├── .github/workflows/build.yml
└── README.md
```

## ▶️ Run

### Start Kafka

```bash
docker compose up -d
```

### Start Producer

```bash
cd producer-service
mvn spring-boot:run
```

### Start Consumer

```bash
cd consumer-service
mvn spring-boot:run
```

## 📡 API

### Publish Order

**POST**

```
http://localhost:8080/orders
```

```json
{
  "id": 1,
  "customerName": "Jayasurya",
  "product": "MacBook Pro",
  "amount": 195000
}
```

## 📌 Future Enhancements

- Retry Mechanism
- Dead Letter Queue (DLQ)
- Swagger/OpenAPI
- Kafka UI
- Testcontainers
- Kubernetes
