# Object Oriented Programming Project 2024

This project was made as part of my work with object oriented programming in Java.  
It is a small program built in IntelliJ IDEA that models a museum system where different objects like coins, weapons and jewelry can be registered and stored in a database.  
The program uses an SQL file for data management and includes a written report that explains how everything was built and why.

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

The main goal of the project is to show how object oriented programming can be used to create a simple data system.  
The system uses classes, inheritance and relationships between objects to handle information in a clear and reusable way.  

The Java code is connected to a small SQL database.  
This lets the program read and manage data about different items found in a museum.  
It is written in a simple structure so it is easy to understand, modify and expand if needed.

---

## Project Structure

- `src` contains all the Java classes and logic for the program  
- `sql` has the SQL script and a small text file with sample data  
- `docs` includes the written report in both PDF and Word format  
- `archive` can be used for storing older or compressed versions later if needed  

The structure makes it easy to see what belongs where.  
Code, database and documentation are separated to keep the project clean.

---

## How to Run

1. Open the project in **IntelliJ IDEA** or another Java editor.  
2. Make sure you have **Java 17** or newer installed.  
3. Open `Main.java` from the `src` folder.  
4. Press the **Run** button in IntelliJ to start the program.  
5. If you want to test the database connection, open and run the SQL file first in your database tool.  

You can also look at the report in the `docs` folder to see how everything is explained and tested.

---

## Files

### Report
[Open the PDF report](./docs/Rapport.pdf)  
The report explains how the program was designed, what the main classes do, and how object oriented principles were used.

---

### SQL Script
[🖱️ Open SQL file](./sql/funn.sql)
This script creates the database structure and includes example data that the Java program can use.  
You can open it directly in your SQL environment or view it in GitHub.

---

### Java Files
All Java files are inside the `src` folder.  
Each class represents something used in the museum system:

- `Main.java` starts the program and handles the flow  
- `DatabaseManager.java` connects the program to the SQL database  
- `Museum.java` represents the main museum  
- `Person.java` represents a person connected to an object  
- `Smykke.java`, `Våpen.java` and `Mynt.java` are different types of artifacts  
- `FunnGjenstand.java` is a general class used as a base for other objects  

Each class has its own task and together they show how object oriented structure works in practice.

---

## Technologies Used

- Java 17  
- IntelliJ IDEA  
- SQL (tested with MySQL and SQLite)  
- GitHub for version control and documentation  

---

## Author

**Mahamed Maki Saine**  
Student in Software Development and Cybersecurity  
Norway | Java | SQL | IntelliJ IDEA  

---

*© 2024 Mahamed Maki Saine. Created for learning and to show understanding of object oriented programming in Java.*
