# BridgeLabz-Training
# 📘 BridgeLabz Training – MySQL JDBC Practice

## Week 8 - Day 1: Database SQL

This repository contains hands-on practice programs for Java Database Connectivity (JDBC) using MySQL.

The focus is on building real-world, database-driven console applications with proper handling of:
- CRUD operations
- Transactions
- Relational data

---

## 🧠 Core Concepts Covered

- JDBC architecture and workflow
- MySQL database connectivity
- CRUD operations using PreparedStatement
- Transaction management (commit, rollback)
- Exception handling in database operations
- Search and filtering using SQL queries
- Mapping database records to Java objects

---

## 🛠️ Practice Exercises Implemented

### 👨‍💼 Exercise 1: Employee Management System (CRUD)

A console-based application that supports:

- ➕ Add new employees
- 📋 View all employee records
- ✏️ Update employee salary
- ❌ Delete employee details
- 🔍 Search employee by name

**Focus Areas:**
- CRUD operations
- Prepared statements
- ResultSet processing

---

### 🏦 Exercise 2: Banking System – Transaction Management

A transaction-safe banking system implementing:

- 💸 Money transfer between accounts using transactions
- 💰 Balance checking
- 🧾 Transaction history tracking
- 🔄 Proper rollback on failure

**Focus Areas:**
- ACID properties
- Transaction management
- Error handling and consistency

---

### 📚 Exercise 3: Library Management System (Advanced)

A database-driven library system supporting:

- 📖 Book inventory management
- 🎓 Student borrowing records
- ⏰ Fine calculation for late returns
- 🔎 Search functionality with multiple filters

**Focus Areas:**
- Relational data handling
- SQL joins
- Real-world query design

---

## ⚙️ Tech Stack

- **Language:** Java
- **Database:** MySQL
- **Connectivity:** JDBC
- **Tools:** MySQL Workbench / CLI, IDE (IntelliJ / Eclipse)

**Code Link:** (Database SQL & Questions)[https://github.com/namankumar0727/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice]

---

# Section - B

## Scenario Based Question

## 🏥 Hospital Management System

### 📌 Overview

This project implements a Hospital Management System (HMS) that supports:
- Patient management
- Doctor management
- Appointment scheduling
- Medical records
- Billing
- System administration

The system is designed using relational database concepts and JDBC-based backend operations to ensure:
- Data integrity
- Security
- Performance

---

### 👥 Actors

- **Receptionist** – Handles patient registration, appointments, billing
- **Doctor** – Manages visits, diagnoses, prescriptions
- **Administrator** – Manages doctors, specialties, reports, and system audits
- **System** – Performs scheduled tasks like database backups

---

## 1️⃣ Patient Management

### UC-1.1: Register New Patient
**Actor:** Receptionist

**Flow:**
1. Enter patient details (name, DOB, contact, address, blood group)
2. Validate uniqueness by phone/email
3. Generate patient ID (auto-increment)
4. Insert record into patients table

---

### UC-1.2: Update Patient Information
**Actor:** Receptionist

**Flow:**
1. Search patient by ID/phone
2. Display current details
