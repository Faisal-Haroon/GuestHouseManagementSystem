# Guest House Management System

## Project Overview
This project is developed as part of the Software Construction course CCP.  
It is a Guest House Management System built according to the provided UML diagram.  
The system manages guests, rooms, and reservations using object-oriented programming in Java.

The main functionalities are:
- Creating reservations for guests  
- Checking room availability  
- Guest check-in and check-out  
- Canceling reservations  
- Managing guest and room information  

The project follows good coding practices, defensive programming, and includes unit testing using JUnit.

---

## Technologies Used
- Java Programming Language  
- JUnit for Unit Testing  
- Git & GitHub for Version Control  
- Visual Studio Code IDE

---

## Project Structure
- controller: business logic classes like GuestHouse and GuestHouseChain  
- entities: domain classes such as Room and Reservation  
- model: supporting classes like Guest, Name, Address  
- test: JUnit test classes  
- main: Main class to run the application

---

## How to Build and Run the Project

### 1. Clone the Repository
Run the following command in terminal:

git clone https://github.com/Faisal-Haroon/GuestHouseManagementSystem.git

### 2. Open the Project
- Open the cloned folder in VS Code or any Java IDE

### 3. Compile the Project

javac main/Main.java

### 4. Run the Program

java main.Main

---

## Running Unit Tests

JUnit tests are provided for domain classes.  
To run the tests:

1. Open the test folder in IDE  
2. Run all test classes  
3. All tests should pass successfully

The tests cover:
- Normal scenarios  
- Boundary conditions  
- Invalid inputs  
- AAA (Arrange-Act-Assert) style

---

## Author
Name: Faisal  
Course: Software Construction  
Semester: 5th
