# 🏦 Bank App - Spring Boot REST API

A RESTful banking application built with Spring Boot and PostgreSQL.

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.5
- Spring Security
- Spring Data JPA
- PostgreSQL
- Lombok
- Swagger / OpenAPI

## 🚀 Features

- User registration with BCrypt password encryption
- Bank account creation
- Deposit & withdrawal operations
- Account-to-account money transfer
- Transaction history
- Global exception handling
- API documentation with Swagger

## 📋 Requirements

- Java 17+
- PostgreSQL
- Maven

## ⚙️ Setup

1. Clone the repository
```bash
   git clone https://github.com/oznuryakut/bankapp.git
   cd bankapp
```

2. Create PostgreSQL database
```sql
   CREATE DATABASE bankapp;
```

3. Update `src/main/resources/application.properties`
```properties
   spring.datasource.username=your_username
   spring.datasource.password=your_password
```

4. Run the application
```bash
   ./mvnw spring-boot:run
```

5. Open Swagger UI



## 📡 API Endpoints

### Users
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/users/register | Register new user |
| GET | /api/users/{id} | Get user by ID |

### Accounts
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/accounts | Create account |
| GET | /api/accounts/user/{userId} | Get user accounts |
| POST | /api/accounts/{accountNumber}/deposit | Deposit money |
| POST | /api/accounts/{accountNumber}/withdraw | Withdraw money |
| POST | /api/accounts/transfer | Transfer money |
| GET | /api/accounts/{accountNumber}/transactions | Transaction history |



