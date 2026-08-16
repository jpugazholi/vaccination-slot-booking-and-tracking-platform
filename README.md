# 💉 Vaccination Slot Booking and Tracking Platform

A web-based **Vaccination Slot Booking and Tracking Platform** designed to simplify the process of vaccination slot booking and vaccination status tracking for citizens and vaccination centers.

The system provides a centralized platform for managing users, vaccination centers, vaccines, vaccination slots, bookings, vaccination status, vaccination records, and vaccination-related services.

The main goal of this project is to reduce manual work, waiting time, and overcrowding at vaccination centers while providing an efficient and transparent vaccination management system.

---

## 📌 1. Introduction

The **Vaccination Slot Booking and Tracking Platform** is a web-based application developed to streamline the process of vaccination slot booking and vaccination status tracking.

Citizens can use the platform to find available vaccination slots based on location, date, and vaccine type. They can book or cancel appointments and track their vaccination status.

Administrators can manage vaccination centers, vaccines, slots, users, and bookings through the administrative side of the system.

The platform is designed to provide a simple, centralized, and efficient solution for vaccination management.

---

## 🎯 2. Objectives

The main objectives of this project are:

* To provide an online platform for citizens to book vaccination slots.
* To allow users to view available vaccination slots.
* To allow users to search slots based on location, date, and vaccine type.
* To help vaccination centers manage available slots.
* To manage vaccination center information.
* To manage vaccine information.
* To manage vaccination bookings.
* To allow users to cancel their appointments.
* To track vaccination status.
* To maintain vaccination records.
* To support vaccination certificate generation.
* To provide booking confirmation and reminder notifications.
* To reduce manual work.
* To reduce waiting time.
* To reduce overcrowding at vaccination centers.
* To provide a centralized vaccination management system.

---

# 🏗️ 3. System Architecture

The application follows a **3-Tier Architecture**.

```text
┌─────────────────────────────────────────────┐
│                  FRONTEND                   │
│                                             │
│        React.js / HTML / CSS / JS           │
│                Bootstrap                    │
└──────────────────────┬──────────────────────┘
                       │
                       │ HTTP / REST API
                       ▼
┌─────────────────────────────────────────────┐
│                  BACKEND                    │
│                                             │
│              Spring Boot                    │
│                  Java                       │
│          Spring Data JPA                    │
│            Spring Security                  │
└──────────────────────┬──────────────────────┘
                       │
                       │ JPA / JDBC
                       ▼
┌─────────────────────────────────────────────┐
│                 DATABASE                    │
│                                             │
│                 MySQL 8.0                   │
└─────────────────────────────────────────────┘
```

### Architecture Layers

```text
Controller
     ↓
Service
     ↓
Repository
     ↓
Entity
     ↓
MySQL Database
```

---

# 📦 4. Project Modules

The platform consists of the following major modules:

### 4.1 User Registration & Login

Citizens can:

* Register an account.
* Login to the platform.
* Manage their personal information.
* View their vaccination-related information.

User information may include:

* Name
* Aadhaar
* Mobile Number
* Email
* Address

---

### 4.2 Vaccination Slot Booking

Users can:

* Search available vaccination slots.
* Search by location.
* Search by date.
* Search by vaccine type.
* Select a vaccination center.
* Select a vaccine.
* Select an available date and time.
* Book a vaccination slot.
* View booking details.
* Cancel a booking.

---

### 4.3 Admin Panel

Administrators can manage:

* Users
* Vaccination Centers
* Vaccines
* Slots
* Bookings
* Vaccination-related information
* Reports and monitoring

---

### 4.4 Vaccination Tracking

The platform supports vaccination status tracking.

Possible vaccination statuses include:

```text
1st Dose
   ↓
2nd Dose
   ↓
Completed
```

The system can maintain vaccination records for users.

---

### 4.5 Certificate Generation

After completion of the required vaccination doses, the system can generate a vaccination certificate.

The certificate may contain:

* User information
* Vaccine information
* Dose information
* Vaccination date
* Vaccination center
* Completion status

---

### 4.6 Notifications

The system is designed to support:

* Booking confirmation notifications.
* Appointment reminders.
* Vaccination reminders.
* Email notifications.
* SMS notifications.

---

# 🔄 5. User Flow

The basic citizen/user flow is:

```text
                         START
                           │
                           ▼
                 ┌──────────────────┐
                 │ Register / Login │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Search Available │
                 │ Vaccination Slots│
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Select Location  │
                 │ Select Center    │
                 │ Select Vaccine   │
                 │ Select Date/Time │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │   Book Slot      │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Booking          │
                 │ Confirmation     │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Attend           │
                 │ Vaccination      │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Track Vaccination│
                 │ Status           │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Required Doses   │
                 │ Completed        │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Generate /       │
                 │ Download         │
                 │ Certificate      │
                 └────────┬─────────┘
                          │
                          ▼
                         END
```

### User Actions

1. Register or login.
2. Search for vaccination slots.
3. Select location.
4. Select vaccination center.
5. Select vaccine.
6. Select date and time.
7. Book the slot.
8. Receive booking confirmation.
9. Attend the vaccination appointment.
10. Track vaccination status.
11. Complete the required doses.
12. Generate/download vaccination certificate.

---

# 👨‍💼 6. Admin Flow

The administrator flow is:

```text
                       ADMIN LOGIN
                            │
                            ▼
                    ┌───────────────┐
                    │ Admin Dashboard│
                    └───────┬───────┘
                            │
          ┌─────────────────┼─────────────────┐
          │                 │                 │
          ▼                 ▼                 ▼
     Manage Users    Manage Centers     Manage Vaccines
          │                 │                 │
          └─────────────────┼─────────────────┘
                            │
                            ▼
                      Manage Slots
                            │
                            ▼
                     Manage Bookings
                            │
                            ▼
                       View Reports
```

### Admin Actions

* Login securely.
* Manage users.
* Add/update vaccination centers.
* Manage vaccine information.
* Create and manage vaccination slots.
* View bookings.
* Manage appointment information.
* Monitor vaccination activities.
* View reports.

---

# 🗄️ 7. Database Design

The application uses **MySQL 8.0** as the database.

## Key Entities

| Entity            | Main Purpose                           |
| ----------------- | -------------------------------------- |
| User              | Stores citizen/user information        |
| Admin             | Stores administrator information       |
| VaccinationCenter | Stores vaccination center details      |
| Vaccine           | Stores vaccine information             |
| Slot              | Stores available vaccination slots     |
| Booking           | Stores vaccination booking information |

### PDF-Based Database Concepts

The project requirements identify the following major data concepts:

```text
Users
Centers
Vaccines
Slots
Appointments
Vaccination_Records
```

These concepts are represented in the current backend through the project's entity model.

---

# 🧩 8. Entity Layer

The Entity layer represents the main database objects.

Current entities:

```text
entity/
├── Admin.java
├── Booking.java
├── Slot.java
├── User.java
├── VaccinationCenter.java
└── Vaccine.java
```

### Current Entity Status

* [x] Admin Entity
* [x] Booking Entity
* [x] Slot Entity
* [x] User Entity
* [x] VaccinationCenter Entity
* [x] Vaccine Entity

---

# 🗃️ 9. Repository Layer

The Repository layer handles database operations using **Spring Data JPA**.

Current repositories:

```text
repository/
├── AdminRepository.java
├── BookingRepository.java
├── SlotRepository.java
├── UserRepository.java
├── VaccinationCenterRepository.java
└── VaccineRepository.java
```

### Current Repository Status

* [x] AdminRepository
* [x] BookingRepository
* [x] SlotRepository
* [x] UserRepository
* [x] VaccinationCenterRepository
* [x] VaccineRepository

---

# ⚙️ 10. Service Layer

The Service layer contains the business logic of the application.

Current services:

```text
service/
├── AdminService.java
├── BookingService.java
├── SlotService.java
├── UserService.java
├── VaccinationCenterService.java
└── VaccineService.java
```

### Current Service Status

* [x] AdminService
* [x] BookingService
* [x] SlotService
* [x] UserService
* [x] VaccinationCenterService
* [x] VaccineService

---

# 📂 11. Project Structure

```text
vaccination-slot-booking-and-tracking-platform/
│
├── backend/
│   └── vaccination-slot-booking/
│       │
│       ├── src/
│       │   ├── main/
│       │   │   │
│       │   │   ├── java/
│       │   │   │   └── com/
│       │   │   │       └── vaccination/
│       │   │   │           └── slotbooking/
│       │   │   │               │
│       │   │   │               ├── entity/
│       │   │   │               │   ├── Admin.java
│       │   │   │               │   ├── Booking.java
│       │   │   │               │   ├── Slot.java
│       │   │   │               │   ├── User.java
│       │   │   │               │   ├── VaccinationCenter.java
│       │   │   │               │   └── Vaccine.java
│       │   │   │               │
│       │   │   │               ├── repository/
│       │   │   │               │   ├── AdminRepository.java
│       │   │   │               │   ├── BookingRepository.java
│       │   │   │               │   ├── SlotRepository.java
│       │   │   │               │   ├── UserRepository.java
│       │   │   │               │   ├── VaccinationCenterRepository.java
│       │   │   │               │   └── VaccineRepository.java
│       │   │   │               │
│       │   │   │               └── service/
│       │   │   │                   ├── AdminService.java
│       │   │   │                   ├── BookingService.java
│       │   │   │                   ├── SlotService.java
│       │   │   │                   ├── UserService.java
│       │   │   │                   ├── VaccinationCenterService.java
│       │   │   │                   └── VaccineService.java
│       │   │   │
│       │   │   └── resources/
│       │   │       └── application.properties
│       │   │
│       │   └── test/
│       │
│       ├── pom.xml
│       ├── mvnw
│       └── mvnw.cmd
│
├── frontend/
├── database/
├── docs/
├── README.md
└── .gitignore
```

---

# 🛠️ 12. Technology Stack

| Category             | Technology        |
| -------------------- | ----------------- |
| Programming Language | Java              |
| Backend Framework    | Spring Boot       |
| ORM                  | Hibernate         |
| Database Access      | Spring Data JPA   |
| Security             | Spring Security   |
| Authentication       | JWT               |
| Frontend             | React.js          |
| UI Framework         | Bootstrap         |
| API Communication    | Axios             |
| Database             | MySQL 8.0         |
| Build Tool           | Maven             |
| Version Control      | Git               |
| Repository           | GitHub            |
| API Testing          | Postman           |
| IDE                  | VS Code           |
| API Documentation    | Swagger / OpenAPI |
| Testing              | JUnit 5           |

---

# 🧪 13. Testing

The backend has been tested using Maven.

Command used:

```text
mvnw.cmd clean test
```

### Test Result

```text
Tests run: 1
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

The backend successfully:

* Compiles the source code.
* Connects to the MySQL database.
* Initializes Hibernate/JPA.
* Detects all 6 JPA repositories.
* Initializes the Spring application context.
* Passes the existing Spring Boot application test.

---

# 📊 14. Current Development Progress

## Backend Foundation

* [x] Project setup
* [x] GitHub repository setup
* [x] Spring Boot backend setup
* [x] Maven configuration
* [x] MySQL database configuration
* [x] Entity layer
* [x] Repository layer
* [x] Service layer
* [x] Maven test verification

## Backend Modules

### Entities

* [x] User
* [x] Admin
* [x] VaccinationCenter
* [x] Vaccine
* [x] Slot
* [x] Booking

### Repositories

* [x] UserRepository
* [x] AdminRepository
* [x] VaccinationCenterRepository
* [x] VaccineRepository
* [x] SlotRepository
* [x] BookingRepository

### Services

* [x] UserService
* [x] AdminService
* [x] VaccinationCenterService
* [x] VaccineService
* [x] SlotService
* [x] BookingService

---

# 🚧 15. Upcoming Development

The following features are planned for the upcoming development phases.

## REST APIs

* [ ] User APIs
* [ ] Admin APIs
* [ ] Vaccination Center APIs
* [ ] Vaccine APIs
* [ ] Slot APIs
* [ ] Booking APIs

## Authentication & Security

* [ ] User Registration
* [ ] User Login
* [ ] Admin Login
* [ ] Spring Security
* [ ] JWT Authentication
* [ ] Role-Based Authorization

## Booking Features

* [ ] Search available slots
* [ ] Filter by location
* [ ] Filter by date
* [ ] Filter by vaccine
* [ ] Book vaccination slot
* [ ] View booking
* [ ] Cancel booking
* [ ] Booking confirmation

## Vaccination Tracking

* [ ] First Dose Tracking
* [ ] Second Dose Tracking
* [ ] Vaccination Completion Status
* [ ] Vaccination Records

## Certificate

* [ ] Certificate Generation
* [ ] Certificate Download

## Notifications

* [ ] Email Notifications
* [ ] SMS Notifications
* [ ] Booking Confirmation
* [ ] Appointment Reminder

## Frontend

* [ ] React.js setup
* [ ] User interface
* [ ] Login/Register pages
* [ ] User dashboard
* [ ] Slot search page
* [ ] Booking page
* [ ] Booking history
* [ ] Vaccination tracking page
* [ ] Certificate page
* [ ] Admin dashboard

## Documentation & Quality

* [ ] Swagger / OpenAPI
* [ ] Unit Testing
* [ ] Integration Testing
* [ ] API Documentation
* [ ] ER Diagram
* [ ] Class Diagram
* [ ] System Architecture Diagram
* [ ] Deployment

---

# 🔐 16. Security

The platform is designed to use **Spring Security and JWT-based authentication**.

## User Role

Users will be able to:

* Register.
* Login.
* View available slots.
* Book vaccination slots.
* View their bookings.
* Cancel bookings.
* Track vaccination status.
* Access vaccination certificates.

## Admin Role

Admins will be able to:

* Login securely.
* Manage users.
* Manage vaccination centers.
* Manage vaccines.
* Manage slots.
* Manage bookings.
* Monitor vaccination activities.
* View reports.

---

# 📑 17. Documentation

The project documentation includes or will include:

* Problem Statement
* Project README
* System Architecture
* Database Design
* ER Diagram
* Class Diagram
* User Flow
* Admin Flow
* API Documentation
* Testing Documentation
* Project Progress

---

# 📈 18. Expected Benefits

The platform aims to provide:

* Easy online vaccination slot booking.
* Reduced waiting time.
* Reduced overcrowding.
* Centralized vaccination information.
* Efficient vaccination center management.
* Better appointment tracking.
* Improved vaccination status tracking.
* Reduced manual work.
* Better transparency.
* Easy access to vaccination records.
* Convenient certificate generation.

---

# 🏁 19. Conclusion

The **Vaccination Slot Booking and Tracking Platform** provides a centralized digital solution for managing vaccination appointments and vaccination-related information.

The project follows a **3-tier architecture** using React.js for the frontend, Spring Boot and Java for the backend, and MySQL for database management.

The backend foundation has been successfully implemented with:

* Entity Layer
* Repository Layer
* Service Layer
* MySQL Database Integration
* Maven Test Verification

The upcoming development phases will focus on REST APIs, authentication, authorization, vaccination slot booking, vaccination tracking, certificate generation, notifications, and the React.js frontend.

The overall goal is to build a secure, efficient, user-friendly, and scalable vaccination management platform.

---

# 📌 20. Project Status

**Current Phase:** Backend Foundation Development

**Completed:** Entity + Repository + Service Layers

**Next Phase:** REST API / Controller Development

---

# 👨‍💻 21. Author

**PUGAZHOLI J**

B.Tech Information Technology
J. J. College of Engineering and Technology

GitHub: **[jpugazholi](https://github.com/jpugazholi)**

---

# 📜 22. License

This project is developed for **educational and academic purposes**.
