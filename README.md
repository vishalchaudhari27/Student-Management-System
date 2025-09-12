# 🎓 Student Management System

## 📌 Introduction

This is a **Student Management System** project built using **Java, Hibernate, Spring Boot, MVC, Bootstrap, MySQL, and Thymeleaf**. It is a simple **CRUD (Create, Read, Update, Delete)** application that manages student records in a clean and user-friendly way.

The system allows users to view the student list, add a new student, update student information, and delete students directly from the interface.

---

## 🚀 Features

* **Student List View** → Displays all students with their details (First Name, Last Name, Email).
* **Add Student** → Button on the top of the list opens a form to create a new student. On submit, the student is added to the list.
* **Update Student** → Each student row has an **Update** button. Clicking it opens a form with pre-filled student details. After editing and submitting, the updated information is saved and the user is redirected to the student list.
* **Delete Student** → Each student row also has a **Delete** button. Clicking it deletes the student instantly from the database without opening any form.
* **Clean UI** using **Bootstrap** and **Thymeleaf templates**.

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot, Hibernate, MVC
* **Frontend:** Thymeleaf, Bootstrap
* **Database:** MySQL

---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites

Make sure you have installed:

* [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/)
* [MySQL Server](https://dev.mysql.com/downloads/)
* Any IDE (IntelliJ IDEA / Eclipse / STS recommended)

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/<your-username>/<repo-name>.git
cd <repo-name>
```

### 3️⃣ Database Setup

* Create a MySQL database (example: `student_db`).
* Update your **`application.properties`** file with DB credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Run the Project

Use Maven to build and run:

```bash
mvn spring-boot:run
```

Or run the project directly from your IDE.

### 5️⃣ Access in Browser

Open: [http://localhost:8080/students](http://localhost:8080/students)

---

## 📷 Snapshots (Replace with your project images)

* Student List Page
* Add Student Form
* Update Student Form

---

## 📝 Summary

This project is a simple and efficient CRUD-based web application for managing student records. It demonstrates the use of **Spring Boot + Hibernate** with a **MySQL database**, styled with **Bootstrap** and **Thymeleaf** for the front-end. It’s ideal for beginners to understand how CRUD operations work in a full-stack Java application.

---
