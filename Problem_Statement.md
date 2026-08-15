# Problem Statement

## 1. Title

Vaccination Slot Booking and Tracking Platform

## 2. Domain

Healthcare / Vaccination Management / Web Application

## 3. Who is the User? (2-3 user types, with roles)

### 1. User / Patient
- Register and log in to the platform.
- Search for vaccination centers.
- View vaccine and slot availability.
- Book and manage vaccination appointments.
- Track booking and vaccination status.

### 2. Admin
- Manage registered users.
- Manage vaccination centers and vaccines.
- Create and manage vaccination slots.
- Manage bookings and vaccination records.
- Monitor platform activities.

### 3. Vaccination Center Staff
- View assigned vaccination slots.
- Manage appointment availability.
- View scheduled appointments.
- Update vaccination status.
- Maintain vaccination records.

## 4. What Problem Are We Solving?

People may face difficulties when searching for vaccination centers, checking vaccine availability, finding suitable appointment slots, and tracking their vaccination status. Information can be difficult to manage when booking and vaccination records are handled through disconnected processes. For example, a user may need to repeatedly check different vaccination centers to find an available slot. This platform provides a centralized system where users can find vaccination centers, check available slots, book appointments, and track their vaccination records.

## 5. Proposed Solution

The application will provide the following features:

- User registration and login
- User profile management
- Vaccination center listing and search
- Vaccine information and availability
- Vaccination slot management
- Appointment booking
- Booking confirmation and status tracking
- Vaccination history
- Admin dashboard
- User management
- Vaccination center management
- Vaccine management
- Slot management
- Booking management
- Vaccination record management

## 6. Core Entities / Database Tables

1. User
2. Admin
3. VaccinationCenter
4. Vaccine
5. VaccinationSlot
6. Booking
7. VaccinationRecord
8. Notification

## 7. User Roles & Permissions

| Role | Permissions |
|------|-------------|
| User / Patient | Register, login, manage profile, search centers, view vaccines and slots, book appointments, view booking status, view vaccination history |
| Admin | Manage users, vaccination centers, vaccines, slots, bookings, and vaccination records |
| Center Staff | Manage assigned slots, view appointments, and update vaccination status |

## 8. Success Criteria

- A new user should be able to register and log in successfully.
- A user should be able to find an available vaccination center and slot easily.
- A user should be able to complete an appointment booking in under 1 minute after selecting an available slot.
- The system should prevent booking of unavailable or full slots.
- Users should be able to view their booking status and vaccination history.
- Admins should be able to manage users, centers, vaccines, slots, and bookings.
- Booking and vaccination data should be stored reliably in the database.

## 9. Out of Scope

The following features are not included in the initial version:

- Actual vaccine delivery or distribution
- Online payment processing
- Direct medical consultation
- Diagnosis or medical advice
- Integration with hospital or clinic hardware
- Physical vaccination center operations
- AI-based medical recommendations
- Native Android/iOS mobile application
- Integration with government vaccination databases
- Real SMS/WhatsApp gateway integration in the initial version

## 10. Chosen Track

Java (Spring Boot)

### Technology Stack

- Frontend: React.js, HTML, CSS, JavaScript
- Backend: Java, Spring Boot
- Database: MySQL
- ORM: Spring Data JPA / Hibernate
- API: REST API
- Testing: Postman
- Version Control: Git & GitHub

## Author

**PUGAZHOLI J**

B.Tech Information Technology  
J. J. College of Engineering and Technology