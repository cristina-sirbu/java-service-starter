# java-service-starter

# Mini Apollo – Java Microservice Starter & Developer Toolkit

> A developer-friendly project starter for building, testing, and deploying Java microservices — inspired by Spotify’s Apollo framework.

---

## Project Goal

Mini Apollo aims to provide a consistent, scalable, and easy-to-use starting point for backend engineers building Java microservices. By bundling best practices around observability, configuration, CI/CD, and local development, this toolkit helps teams ship faster with less friction.

---

## Features

- [x] Minimal REST API starter (`/hello`, `/health`)
- [x] Structured logging with request tracing
- [x] Metrics support via Micrometer (Prometheus-ready)
- [ ] Built-in testing structure
- [ ] Config via environment variables or property files
- [ ] Docker-ready
- [ ] CI/CD pipeline with GitHub Actions
- [ ] Optional: Helm / Kubernetes deployment configs

---

## Tech Stack

| Layer      | Tool              |
|------------|-------------------|
| Language   | Java 17+          |
| Framework  | Spring Boot       |
| Build Tool | Maven             |
| Metrics    | Micrometer        |
| Logging    | SLF4J + Logback   |
| CI/CD      | GitHub Actions    |
| Container  | Docker            |
| Deployment | Kubernetes        |
| IaC        | Terraform for GCP |

---

## Quickstart

> _Clone the template and run locally_

```bash
git clone https://github.com/cristina-sirbu/java-service-starter.git
cd mini-apollo/service-template

mvn spring-boot:run
```

```shell
curl http://localhost:8080/hello # dummy endpoint
curl http://localhost:8080/fail # endpoint to test failures
curl http://localhost:8080/health # health check
curl http://localhost:8080/actuator/health # is the application UP and running?
curl http://localhost:8080/actuator/metrics # for metrics to be scraped by Prometheus
```

---

## Feedback

Open an issue or PR if you have ideas or suggestions! This project is designed for internal platform use, but feedback from other engineers is always welcome.

bfb33eb Cristina Junca (Sirbu) <sirbucristina.is@gmail.com>
