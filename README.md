# Object Oriented Programming Project 2024

This project demonstrates the use of object oriented programming principles in Java.  
It includes a small data management system built in IntelliJ IDEA, supported by an SQL script for data handling and a written report explaining the design, functionality and results.

---

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Files](#files)
- [Technologies Used](#technologies-used)
- [Author](#author)

---

## Overview

The goal of this project is to model a simple museum database using object oriented programming concepts such as classes, inheritance and encapsulation.  
The Java program connects to a local SQL database to handle different types of objects like coins, weapons and jewelry.  

The structure of the project is built around separate Java classes for each type of object, a main class to handle logic and a database manager to interact with the SQL layer.  
All classes follow the same naming and documentation conventions.

---

## Project Structure

- `src` → Java source files containing the main logic and data classes  
- `sql` → SQL script and helper text file  
- `docs` → Report files (PDF and DOCX)  
- *(optional)* `archive` → Original compressed project file if included later  

---

## How to Run

1. Open the project in **IntelliJ IDEA** (or any Java IDE).  
2. Ensure you have **Java 17** or newer installed.  
3. In IntelliJ, open `Main.java` inside the `src` folder.  
4. Compile and run the file using the IDE’s run button.  
5. (Optional) Execute the SQL script in your local database environment before running the Java program.

---

## Files

### 📘 Report  
[🖱️ Click to open PDF report](./docs/Rapport.pdf)  
Contains the written explanation of the system design and results.

---

### 🧩 SQL Script  
[🖱️ Open SQL file](./sql/Funn.sql)  
This script creates the database tables and initial data used by the Java program.  

Helper text file for reference:  
[🖱️ View funn.txt](./sql/funn.txt)

---

### 💻 Java Source Files  
Located in the [`src`](./src) folder.  
Main classes include:  
- `Main.java` — starts the application  
- `DatabaseManager.java` — manages SQL connection  
- `Museum.java`, `Person.java`, `Smykke.java`, `Våpen.java`, `Mynt.java` — represent different objects  
- `FunnGjenstand.java` — base class for artifacts  

---

## Technologies Used

- **Java 17**  
- **IntelliJ IDEA**  
- **SQL (SQLite / MySQL)**  
- **GitHub** for version control and documentation  

---

## Author

**Mahamed Maki Saine**  
Software and Cybersecurity Student  
📍 Norway | Java | SQL | IntelliJ | Object Oriented Programming  

---

*© 2024 Mahamed Maki Saine — Created as part of the Object Oriented Programming coursework and refined for professional presentation.*
