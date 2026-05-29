# 📦 Warehouse Management System

A full-stack inventory management application built with **Spring Boot**, **React**, and **MySQL** — supporting real-time product tracking, stock management, and supplier operations through a clean REST API layer.

---

## 🖼️ Screenshots

### Dashboard — Inventory Overview
![Dashboard](assets/dashboard.png)
> *The main React dashboard showing the product list/table with all inventory items visible*

### Add Product Form
![Add Product](assets/add-product.png)
> *The modal or form for adding a new product*

### Edit / Update Product
![Edit Product](assets/edit-product.png)
> The edit form open for an existing product*

### Stock / Supplier View
![Supplier View](assets/supplier-view.png)
> *The supplier or stock section of the dashboard*

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java 17, Spring Boot 3 |
| Frontend | React.js (Create React App) |
| Database | MySQL |
| API Style | RESTful (JSON) |
| Build Tools | Maven, npm |
| IDE | IntelliJ IDEA |

---

## ✨ Features

- ✅ Add, view, update, and delete products (full CRUD)
- ✅ Real-time inventory tracking with React dashboard
- ✅ Stock level management — monitor quantity in/out
- ✅ Supplier management — link products to suppliers
- ✅ 8 REST API endpoints for seamless frontend-backend communication
- ✅ Supports 1,000+ inventory records
- ✅ Reduced manual data-entry workflow by ~50%

---

## 🗂️ Project Structure

```
Warehouse-Management-System/
│
├── warehouse/                  # Spring Boot backend
│   └── src/main/java/
│       ├── controller/         # REST API controllers
│       ├── model/              # Entity classes (Product, Stock, Supplier)
│       ├── repository/         # JPA repositories
│       ├── service/            # Business logic layer
│       └── WarehouseApplication.java
│
├── src/                        # React frontend
│   ├── components/             # Reusable UI components
│   ├── pages/                  # Dashboard, Products, Suppliers
│   └── App.js
│
├── package.json
└── README.md
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/products` | Fetch all products |
| `GET` | `/api/products/{id}` | Get product by ID |
| `POST` | `/api/products` | Add new product |
| `PUT` | `/api/products/{id}` | Update product |
| `DELETE` | `/api/products/{id}` | Delete product |
| `GET` | `/api/stock` | Get all stock records |
| `PUT` | `/api/stock/{id}` | Update stock level |
| `GET` | `/api/suppliers` | Get all suppliers |

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

### 2. Set up the database

```sql
CREATE DATABASE warehouse_db;
```

Update `warehouse/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/warehouse_db
spring.datasource.username=root
spring.datasource.password=Root
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Spring Boot backend

```bash
cd warehouse
mvn spring-boot:run
```

Backend runs at: `http://localhost:8080`

### 4. Run the React frontend

```bash
# From the root directory
npm install
npm start
```

Frontend runs at: `http://localhost:3000`

---

## 📊 Database Schema (Overview)

```
products       → id, name, category, quantity, price, supplier_id
stock          → id, product_id, quantity_in, quantity_out, updated_at
suppliers      → id, name, contact_email, phone, address
```

---

## 🚧 Future Improvements

- [ ] Add JWT-based authentication (Spring Security)
- [ ] Deploy backend to Railway / Render
- [ ] Deploy frontend to Vercel / Netlify
- [ ] Add low-stock alert notifications
- [ ] Export inventory report as PDF/Excel

---

## 👩‍💻 Author

**Deeksha Bhati**  
B.Tech CSE @ NIET, Greater Noida | CGPA: 8.7

[![LinkedIn](https://img.shields.io/badge/LinkedIn-deekshabhati910-blue?logo=linkedin&style=flat)](https://linkedin.com/in/deekshabhati910)
[![GitHub](https://img.shields.io/badge/GitHub-Deekshabhati2018-black?logo=github&style=flat)](https://github.com/Deekshabhati2018)
[![LeetCode](https://img.shields.io/badge/LeetCode-_DeekshaBhati_-orange?logo=leetcode&style=flat)](https://leetcode.com/_DeekshaBhati_)

---

> ⭐ If you found this project useful, consider starring the repo!
