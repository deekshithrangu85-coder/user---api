# 🚀 User API - Spring Boot

## 📌 Description
This project is a REST API built using Spring Boot.  
It demonstrates clean architecture using DTOs, validation, and global exception handling.

---

## 🔥 Features
- DTO Pattern (No direct entity exposure)
- Input Validation (`@NotBlank`, `@Email`)
- Global Exception Handling (`@ControllerAdvice`)
- RESTful APIs
- Swagger UI for API documentation

---

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|--------|-------------|
| POST | /users | Create user |
| GET | /users | Get all users |
| GET | /users/{id} | Get user by ID |

---

## 🧪 Testing
- Postman
- Swagger UI  
  👉 http://localhost:8080/swagger-ui.html

---

## ▶️ Run Project

```bash
mvn spring-boot:run