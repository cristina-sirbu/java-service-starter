# 2. Framework Foundation

## Status

Accepted

## Context

This project aims to create a developer-friendly microservice starter kit inspired by Spotify’s [Apollo](https://github.com/spotify/apollo).

The architecture should:
- Be easy to onboard for backend developers
- Ensure production readiness (logging, metrics, deployment)
- Enable fast iteration and extensibility

## Decision

We chose the following components:

### 1. **Framework: Spring Boot**
- Widely adopted and familiar to most backend engineers
- Strong ecosystem support (Actuator, Micrometer, etc.)
- Declarative configuration model aligns with DevEx goals

### 2. **Build Tool: Maven**
- Convention-based, readable, stable
- Ideal for platform-style projects with reusable templates

### 3. **Containerization: Docker**
- Standard toolchain for portability and dev consistency
- Prepares the project for real-world deployment via Helm/Kubernetes

### 4. **Observability: Spring Actuator + Micrometer**
- Out-of-the-box support for metrics and health checks
- Prometheus-compatible endpoint for future integration

### 5. **Logging: SLF4J + MDC Request ID Correlation**
- Enables traceable, structured logs per request
- Adds value for debugging and monitoring at scale

## Consequences

I will build a service template that:
- Can be cloned and extended for real services
- Exposes `/hello`, `/health`, and `/metrics`
- Runs locally in Docker and on Kubernetes
- Includes CI with GitHub Actions
- Simulates Terraform deployment for GCP

Tradeoffs for the chosen components:

- Spring Boot has a larger memory/runtime footprint than Micronaut or Quarkus
- Maven is slightly slower than Gradle, but easier to adopt across teams
- GCP deployment is simulated only (no billing risk), which limits runtime testing

Future considerations:

- CLI tool for service generation
- CI to publish images to an image registry
