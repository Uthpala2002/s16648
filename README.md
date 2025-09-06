Project Title

Database Programming with Java and MySQL

📂 Source Code

This repository contains the full source code for a Java program that connects to a MySQL database and performs basic operations.

⚙ Setup Instructions
1. Install Requirements

Java: Version 8 or later

MySQL Server: Installed and running

MySQL Connector/J: Add mysql-connector-java-x.x.x.jar to your IntelliJ project libraries

2. Create Database

Open MySQL and run the following commands:

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    
);

3. Configure Database Connection

Update your Java file (Main.java or CreateTableDemo.java) with your database credentials:

String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";   // replace with your MySQL username
String password = "your_password"; // replace with your MySQL password

4. Run the Program

Open project in IntelliJ IDEA

Build and run the main class (e.g., Main.java)

The program should connect to the database and execute queries



✅ Example Run
Connected to the database successfully!
Table created successfully!
Record inserted successfully!

👨‍💻 Author

Uthpala2002
