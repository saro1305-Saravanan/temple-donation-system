# Temple Donation System

A full-stack Java web application for managing temple donations, user authentication, donation verification, and donation reports.

# Tech Stack

* Frontend: HTML5, CSS3, Vanilla JavaScript
* Backend: Spring Boot 3 (Java)
* Database: PostgreSQL (Neon Cloud)
* Build Tool: Maven
* Server: Embedded Apache Tomcat
* API Testing: Postman
* Hosting: Render
* Version Control: Git & GitHub

# Features

* User Login System
* Admin Login System
* Add Donations
* Verify Donations
* Reject Donations
* View Donation Reports
* Total Donation Statistics
* Cloud Database Integration
* Responsive Design
* Online Deployment

# Project Structure

TempleDonationSystem/
├── src/main/java/com/temple/donation/
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── DonationController.java
│   │   └── PageController.java
│   ├── model/
│   │   ├── User.java
│   │   └── Donation.java
│   ├── repository/
│   │   ├── UserRepository.java
│   │   └── DonationRepository.java
│   └── TempleDonationSystemApplication.java
│
├── src/main/resources/
│   ├── application.properties
│   └── static/
│       ├── login.html
│       ├── donation.html
│       ├── admin.html
│       ├── report.html
│
├── pom.xml
├── Dockerfile
└── README.md

# Setup Instructions

# Step 1 - Database Setup

Create a PostgreSQL database in Neon.

# Step 2 - Configure Database

Update application.properties:

* DATABASE_URL
* DATABASE_USERNAME
* DATABASE_PASSWORD

# Step 3 - Configure Environment Variables

Add in Render:

* DATABASE_URL
* DATABASE_USERNAME
* DATABASE_PASSWORD

# Step 4 - Run Application

1. Import project into Eclipse
2. Update Maven Dependencies
3. Run TempleDonationSystemApplication.java
4. Open:
https://temple-donation-system.onrender.com/

# Step 5 - Deploy

1. Push project to GitHub
2. Connect repository to Render
3. Configure Neon PostgreSQL
4. Deploy application

# Login Credentials

# Admin

* Username: Saravanan
* Password: saro1

# User

* Username: USER
* Password: 12345

# API Endpoints

| Method | URL                    | Description          |
| ------ | ---------------------- | -------------------- |
| POST   | /users/login           | User/Admin Login     |
| POST   | /users/add             | Add User             |
| POST   | /donations/add         | Add Donation         |
| GET    | /donations/all         | View All Donations   |
| GET    | /donations/total       | Total Donation Count |
| PUT    | /donations/verify/{id} | Verify Donation      |
| PUT    | /donations/reject/{id} | Reject Donation      |


# Deployment

# Backend Hosting

* Render

# Database Hosting

* Neon PostgreSQL

# Source Code Repository

* GitHub

#Author

N. Saravanan
B.Tech Information Technology
