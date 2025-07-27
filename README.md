### 👋 Welcome to the official project repository for "JPA with Pagination, Sorting, and Custom Queries" using Spring Boot.

This project is part of the **Spring Boot Tutorials** series by **Shadab Rehan**, aimed at helping developers understand key Spring Data JPA concepts used in real-world applications.

---

## 🚀 Project Overview

This Spring Boot project demonstrates:

- How to perform basic CRUD operations using Spring Data JPA
- Implementing pagination and sorting with RESTful endpoints
- Creating custom query methods using Spring JPA naming conventions and JPQL
- Applying entity-level constraints such as unique keys and indexes
- Writing test cases to verify repository logic using Spring Boot Test

---

## 📂 Project Structure

- **controller**: Exposes `/products` REST API to support sorting and pagination
- **entities**: Defines the Product entity with fields like title, price, quantity, and timestamps
- **repositories**: Contains the JPA repository interface with custom methods
- **main application class**: Bootstraps the Spring Boot app
- **test class**: Includes JUnit-based repository testing
- **resources**: Contains application properties and optional SQL data for initialization

---

## ⚙️ Features

- REST API to fetch product data with sorting and pagination support
- Dynamic query parameters such as `sortBy` and `pageNumber`
- Support for multiple sorting fields (e.g., price + title)
- Custom finder methods using Spring Data JPA and JPQL
- Auto-formatted SQL logs for better debugging
- Integration tests using `@SpringBootTest`

---

## 🌐 API Details

- **Base URL**: `/products`
- **Supported Parameters**:
  - `sortBy`: Field to sort (e.g., `price`, `quantity`, etc.)
  - `pageNumber`: Page index starting from 0

The API returns a paginated list of products sorted as per the input parameters.

---

## 🧪 Repository Methods

Includes the following types of data access patterns:

- Basic finders (e.g., find by price, quantity)
- Compound filters (e.g., find by quantity and price)
- JPQL queries for specific matching logic (e.g., title and price)

---

## 🧾 Configuration

Application connects to a MySQL database using properties like:

- `spring.datasource.url`, `username`, and `password`
- `spring.jpa.hibernate.ddl-auto=create` to auto-generate schema
- SQL logging and formatting enabled for debugging
- SQL file initialization supported via `data.sql`

---

## 🧪 Testing

Repository methods are tested using:

- Sample insertions with `builder` pattern
- JPQL and native query validations
- Data retrieval with sorting, pagination, and filters

---

## ✅ Learning Outcomes

By the end of this project, you will be able to:

- Use Spring Data JPA for database interactions
- Implement sorting and pagination using `Pageable`
- Write clean, optimized, and secure JPQL queries
- Understand how to apply unique constraints and indexes in JPA
- Test repositories effectively using Spring Boot's test framework

---

## 📬 Connect with Me

**Author**: Shadab Rehan  
📧 LinkedIn: https://www.linkedin.com/in/shadabrehan

---

