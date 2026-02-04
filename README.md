# Spring Boot MVC Project

This project is built to understand **Spring Boot application structure** and how **MVC (Model–View–Controller)** architecture is implemented in real-world applications.

In this project, I learned how Spring Boot organizes code into **Controller, Service, and Repository layers**, and how data flows between them using an in-memory **H2 Database**.

---

##  What I Learned

- Understanding **MVC architecture** in Spring Boot
- Role of **Controller, Service, and Model layers**
- Separating business logic from request handling
- Using **Spring Data JPA Repository**
- Working with **H2 in-memory database**
- Creating clean layered architecture
- How Spring Boot handles requests internally

---

## MVC Layer Explanation (My Understanding)

### Controller
- Handles **client HTTP requests**
- Acts as the **entry point** of the application
- Calls the service layer

### Service
- Contains **business logic**
- Acts as a bridge between Controller and Repository
- Keeps controllers clean

### Model
- Represents application data
- Used for mapping database tables
- Acts as the **Model** in MVC

### Repository
- Handles **database operations**
- Uses Spring Data JPA to interact with H2 Database

---
Client (Browser / Postman)
↓
Controller
↓
Service
↓
Repository
↓
Database (H2)


---

##  Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- VS Code

---

##  Project Structure


src/main/java/com/example/demo
│
├── Controller # Handles client requests
├── Service # Business logic
├── Repository # Database access
├── models # Entity / Model classes
│
└── DemoApplication.java


---

##  How to Run the Project

```bash
mvn clean install
mvn spring-boot:run
 H2 Database

H2 is an in-memory database

Used for learning and testing purposes

Data resets when application restarts

Access H2 Console:
http://localhost:8080/h2-console

## 🔁 Request Flow

