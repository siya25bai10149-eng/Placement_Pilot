PlacementPilot: Academic & Placement Tracking System.

📌 Project Overview
PlacementPilot is a Java-based command-line application designed to bridge the gap between student academic records and corporate recruitment criteria. During the placement season, students often struggle to track which companies they are eligible for based on shifting CGPA cutoffs and backlog constraints.

This project automates that process, providing an instant eligibility report and a persistent record of application statuses.

🎯 Problem Statement
Managing multiple internship and placement opportunities is a manual and error-prone process. Students must constantly cross-reference their current academic standing (CGPA/Backlogs) against various company requirements. PlacementPilot solves this by:

Storing a digital profile of the student.

Maintaining a database of active recruiters and their specific criteria.

Generating an automated "Eligibility Report" to save time and reduce application rejections.

🛠️ Technical Features & Java Concepts Used
To meet the Programming in Java course requirements, this project implements:

Encapsulation: Protecting student data (CGPA, Backlogs) using private fields and public getters.

Inheritance: A hierarchy where Student extends a base User class to demonstrate code reusability.

Abstraction: Using abstract methods in the User class to enforce a consistent profile display across different user types.

Collections Framework: Utilizing ArrayList to dynamically manage a growing list of companies.

File I/O: Implementing PrintWriter and FileWriter to save eligibility results into a permanent .txt file.

Exception Handling: Using try-catch blocks to ensure the program handles invalid numerical inputs without crashing.

🚀 Getting Started
Prerequisites
Java Development Kit (JDK) 11 or higher.

A terminal or command prompt.

Installation & Execution
Clone the repository:

Bash
git clone https://github.com/your-username/PlacementPilot.git
Navigate to the source directory:

Bash
cd PlacementPilot/src
Compile the Java files:

Bash
javac PlacementPilot.java
Run the application:

Bash
java PlacementPilot

📂 Project Structure

Plaintext

PlacementPilot/

├── src/
│   ├── User.java          # Abstract Base Class
│   ├── Student.java       # Subclass for student-specific data
│   ├── Company.java       # Logic for eligibility criteria
│   └── PlacementPilot.java # Main Driver Class & File I/O
├── README.md              # Project Documentation
└── eligibility_report.txt  # Generated output file (post-run)



📝 Author
Student Name: Aryan Sharma

Course: Programming in Java (Capstone Project)

Deadline: March 31, 2026
