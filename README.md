
# 🚗 Car Rental System — Software Design & Architecture Project

> **Sir Syed University of Engineering & Technology (SSUET)**
> Department of Software Engineering
> *Semester: 4th — Course: SE-211L (Software Design & Architecture)*

---

## 📘 Project Overview

The **Car Rental System** is a Spring Boot–based web application that provides an easy and efficient platform for renting luxury cars.
It offers both **customer** and **admin** interfaces, built using **Java (Spring Boot), HTML, and CSS**, and implements multiple **design patterns** to ensure scalability and clean architecture.
![WhatsApp Image 2025-10-26 at 4 41 50 AM](https://github.com/user-attachments/assets/4a88dc4d-9c34-4aea-b505-edd2f90b328f)
![WhatsApp Image 2025-10-26 at 4 41 49 AM](https://github.com/user-attachments/assets/628efb6d-c1c0-42d6-ac11-869c0421399c)



## 🎯 Objectives

* Provide a **user-friendly interface** for renting cars.
* Enable **real-time operations** with no booking conflicts.
* Support **database integration** for data persistence.
* Simplify **admin operations** like adding, removing, or updating vehicles.

---

## ⚙️ Tools & Technologies

| Category          | Tools / Frameworks                   |
| ----------------- | ------------------------------------ |
| **Frontend**      | HTML, CSS                            |
| **Backend**       | Java (Spring Boot)                   |
| **IDE**           | IntelliJ IDEA                        |
| **Diagram Tools** | SmartDraw, Rational Rose             |
| **Database**      | H2 / MySQL (Spring Boot Integration) |

---

## 🧠 Design Patterns Implemented

### 1. **Singleton Pattern**

Used in Spring Boot for managing service and component instances through dependency injection using `@Autowired`.

### 2. **Builder Pattern**

Used to construct `RentalOrder` objects step-by-step for cleaner object creation.

### 3. **Factory Pattern**

Implements `CarFactory` to create cars for different companies dynamically and populate the database.

### 4. **Command + Null Object Pattern**

* `Execution` interface defines commands.
* `CommandExecutor` executes valid commands or uses a `NullCommand` if no match is found.

### 5. **Observer Pattern**

Implemented in `AdminCommandMediator`, observing changes made by the admin in entities such as cars or customers.

### 6. **Adapter Pattern**

Connects incompatible interfaces `PriceSetter` and `Calculator` via `CostCalculator` adapter.

### 7. **Mediator Pattern**

`AdminCommandMediator` centralizes communication between command classes and controllers, reducing coupling.

### 8. **Chain of Responsibility**

Used in `AdminController` to handle cost-setting operations between multiple `PriceSetter` classes.

---

## 🧰 Functional Requirements

| Actor        | Functionality                                        |
| ------------ | ---------------------------------------------------- |
| **Customer** | Place rental order, get order details, make payments |
| **Admin**    | Add, remove, edit cars in the database               |
| **System**   | Store and manage all rental data efficiently         |

### 🧮 Non-Functional Requirements

* Easy to use
* Fast and responsive
* Efficient and reliable

---

## 🖥️ Project Features

✅ Modern and responsive UI
✅ User can rent cars from multiple companies
✅ Lookup rental order by unique ID
✅ Secure multi-method payment
✅ Dedicated Admin Dashboard

---

## 🔍 System Behavior

### 🧩 Use Case

* **Customer:** Browse, rent, and check rental details.
* **Admin:** Manage cars, customers, orders, and pricing factors.

### ⚙️ Activity Flow

1. User visits the **main dashboard**
2. Can choose to **place a rental** or **check details**
3. Admins log in to modify database entries and pricing factors
---

## 🧮 Development Process

1. **Spring Boot Setup**

   * Initialized project using [Spring Initializr](https://start.spring.io/)
   * Configured entities, services, and repositories

2. **Design Pattern Implementation**

   * Applied all eight patterns across classes and controllers

3. **Integration Phase**

   * Connected UI to backend
   * Integrated database operations
   * Tested each pattern for functionality

---

## 🏁 Outcome

A functional **Car Rental Web Application** that demonstrates:

* Strong grasp of **object-oriented principles**
* Practical use of **multiple design patterns**
* Clear architectural separation between UI, business logic, and database

---

## 🔮 Future Expansion

* Add separate **user login & profile** for customers
* Implement **Spring Security** for authentication
* Introduce **feedback and report systems** per car
* Add **driver/chauffeur services**
* Expand beyond luxury cars

---

## 🧾 License

This project is developed as part of **Software Design & Architecture (SE-211L)** at **SSUET**.
All rights reserved © 2025 by **Team 2023F-BSE-F**.

---

## 📬 Contact

**Instructor:** Ms. Maham Imran & Ms. Dur-e-Shawar Agha
**Team Lead:** Muhammad Shaheer Abbasi
**Contributor:** Syed Muhammad Azan 
**University:** [Sir Syed University of Engineering & Technology (SSUET)](https://www.ssuet.edu.pk/)

