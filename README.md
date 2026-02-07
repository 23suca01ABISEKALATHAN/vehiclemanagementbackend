# 🚗 Vehicle Management Backend

A robust **Spring Boot backend application** for the Vehicle Management System.  
This project provides RESTful APIs to manage vehicle-related data and follows modern DevOps practices including **CI with SonarCloud**, **Docker containerization**, and **cloud deployment on Render**.

---

## 🌐 Live Backend Deployment

🚀 **Backend API (Render):**  
https://vehiclemanagementbackend.onrender.com

> ⚠️ Note: Initial request may take a few seconds due to Render free-tier cold start.

---


## 📖 Project Overview

The Vehicle Management Backend handles all server-side logic and data processing for the system. It exposes REST APIs that allow the frontend to perform CRUD operations related to vehicles.

The project emphasizes:
- Clean architecture
- Code quality
- CI/CD practices
- Containerized deployment

---

## ✨ Features

- 🚘 Vehicle CRUD operations (Create, Read, Update, Delete)
- 🌐 RESTful API design
- 🧪 CI with SonarCloud for code quality analysis
- 🐳 Dockerized backend service
- ☁️ Cloud deployment using Render
- 📦 Maven-based project structure

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Maven**
- **REST APIs**
- **SonarCloud** – Continuous Integration & code quality
- **Docker** – Containerization
- **Render** – Backend deployment

---

## 📁 Project Structure

```plaintext
vehiclemanagementbackend/
├── .github/workflows/
│   └── sonar.yml
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── .gitignore
├── Dockerfile
├── pom.xml
└── README.md
````

---

## 🚀 Getting Started (Local Setup)

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/23suca01-svg/vehiclemanagementbackend.git
```

### 2️⃣ Build the Project

```bash
mvn clean install
```

### 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

The backend will start at:
👉 `http://localhost:8080`

---

## 🔗 API Endpoints (Sample)

| Operation         | Method | Endpoint             |
| ----------------- | ------ | -------------------- |
| Get all vehicles  | GET    | `/api/vehicles`      |
| Get vehicle by ID | GET    | `/api/vehicles/{id}` |
| Add vehicle       | POST   | `/api/vehicles`      |
| Update vehicle    | PUT    | `/api/vehicles/{id}` |
| Delete vehicle    | DELETE | `/api/vehicles/{id}` |

---

## 🔍 Continuous Integration (SonarCloud)

This project uses **SonarCloud CI** to ensure high code quality.

✔ Static code analysis
✔ Bug & vulnerability detection
✔ Code smells and maintainability checks
✔ Quality gate validation on pull requests

SonarCloud analysis runs automatically via **GitHub Actions** on every push and pull request.

---

## 🐳 Docker Support

A **Dockerfile** is included to containerize the backend application.

### Build Docker Image

```bash
docker build -t vehiclemanagementbackend .
```

### Run Docker Container

```bash
docker run -p 8080:8080 vehiclemanagementbackend
```

---

## ☁️ Deployment (Render)

* Docker image built from the repository
* Backend deployed on **Render**
* Automatic redeploy on new commits
* Scalable and cloud-hosted API

---

## 📸 Screenshots

![Backend Dashboard](screenshots/demo.png)
![Backend Dashboard](screenshots/demo1.png)
![Backend Dashboard](screenshots/demo2.png)



## 🔮 Future Enhancements

* 🔐 Authentication & authorization
* 🧪 Unit & integration tests
* 📊 Logging and monitoring
* 🔄 CI/CD pipeline improvements


This project is licensed under the **MIT License**.

