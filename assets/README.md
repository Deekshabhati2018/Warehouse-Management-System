# 💗 Pretty Pink Warehouse — Warehouse Management System

A full-stack inventory management application built with **Java Spring Boot**, **React.js**, and **MySQL**. Supports real-time product tracking with complete CRUD operations through a clean REST API.

---

## 🖼️ Screenshots

### React Frontend — Product Dashboard
![Frontend Dashboard](assets/frontend-dashboard.png)
> Live product cards with Name, Price, Quantity, SKU — Add, Edit, Delete operations in real time at `localhost:3000`

### REST API — Postman Test (GET /products)
![API Response](assets/api-postman.png)
> `GET http://localhost:8080/products` returning `200 OK` in 471ms with full JSON product list

### Spring Boot Backend — Eclipse IDE
![Backend Code](assets/backend-eclipse.png)
> `Product.java` entity with `id`, `name`, `sku`, `price`, `quantity` fields — Spring Boot app started on port 8080 in 6.79s

### Frontend Compilation — npm start
![npm start](assets/npm-start.png)
> React app (`wms-frontend`) compiled successfully and served at `localhost:3000`

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java 17, Spring Boot, Spring Data JPA, Hibernate |
| Frontend | React.js (Create React App) |
| Database | MySQL |
| API Style | RESTful JSON |
| API Testing | Postman |
| Build Tools | Maven, npm |
| IDE | Eclipse IDE for Enterprise Java |

---

## ✨ Features

- ✅ Add new products with Name, SKU, Price, and Quantity
- ✅ View all inventory as real-time product cards
- ✅ Edit existing product details inline
- ✅ Delete products with instant UI update
- ✅ Spring Boot REST API with full CRUD endpoints
- ✅ React frontend auto-syncs with backend on every operation
- ✅ MySQL persistence via Spring Data JPA + Hibernate
- ✅ Tomcat embedded server — no external server setup needed

---

## 🗂️ Project Structure

```
Warehouse-Management-System/
│
├── warehouse/                          # Spring Boot backend
│   └── src/main/java/com/wms/warehouse/
│       ├── WarehouseApplication.java   # Main entry point
│       ├── controller/                 # REST controllers
│       ├── entity/
│       │   └── Product.java            # id, name, sku, price, quantity
│       └── repository/                 # Spring Data JPA repositories
│
├── src/                                # React frontend
│   └── (components, pages, App.js)
│
├── pom.xml                             # Maven config
├── package.json                        # npm config
└── README.md
```

---

## 📡 API Endpoints

Base URL: `http://localhost:8080`

| Method | Endpoint | Description | Status |
|--------|----------|-------------|--------|
| `GET` | `/products` | Fetch all products | `200 OK` |
| `GET` | `/products/{id}` | Get product by ID | `200 OK` |
| `POST` | `/products` | Add new product | `201 Created` |
| `PUT` | `/products/{id}` | Update product | `200 OK` |
| `DELETE` | `/products/{id}` | Delete product | `204 No Content` |

### Sample API Response — `GET /products`

```json
[
  {
    "id": 1,
    "name": "HP Laptop",
    "price": 65000.0,
    "quantity": 100,
    "sku": "HP101"
  },
  {
    "id": 2,
    "name": "Iphone 17 pro",
    "price": 150000.0,
    "quantity": 50,
    "sku": "UI102"
  },
  {
    "id": 4,
    "name": "Pink Nike Shoes",
    "price": 8500.0,
    "quantity": 25,
    "sku": "Nik103"
  }
]
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Node.js 18+
- MySQL 8+
- Maven

### 1. Clone the repository

```bash
git clone https://github.com/Deekshabhati2018/Warehouse-Management-System.git
cd Warehouse-Management-System
```

### 2. Configure the database

Create a MySQL database and update `warehouse/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/warehouse_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the Spring Boot backend

```bash
cd warehouse
mvn spring-boot:run
```

Backend starts at: `http://localhost:8080`  
> Spring Boot initializes in ~7 seconds, Tomcat on port 8080

### 4. Run the React frontend

```bash
# From root directory
npm install
npm start
```

Frontend starts at: `http://localhost:3000`

---

## 🧱 Data Model

```
Product
├── id          Long       (auto-generated)
├── name        String     e.g. "HP Laptop"
├── sku         String     e.g. "HP101"
├── price       double     e.g. 65000.0
└── quantity    int        e.g. 100
```

---

## 🚧 Future Improvements

- [ ] JWT authentication (Spring Security)
- [ ] Supplier and category management
- [ ] Low-stock alerts
- [ ] Deploy backend to Railway / Render
- [ ] Deploy frontend to Vercel
- [ ] Export inventory as Excel/PDF

---

## 👩‍💻 Author

**Deeksha Bhati**  
B.Tech CSE @ NIET, Greater Noida | CGPA: 8.7

[![LinkedIn](https://img.shields.io/badge/LinkedIn-deekshabhati910-blue?logo=linkedin&style=flat)](https://linkedin.com/in/deekshabhati910)
[![GitHub](https://img.shields.io/badge/GitHub-Deekshabhati2018-black?logo=github&style=flat)](https://github.com/Deekshabhati2018)
[![LeetCode](https://img.shields.io/badge/LeetCode-_DeekshaBhati_-orange?logo=leetcode&style=flat)](https://leetcode.com/_DeekshaBhati_)

---

> ⭐ If you found this project useful, consider starring the repo!
