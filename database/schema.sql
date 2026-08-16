CREATE DATABASE IF NOT EXISTS vaccination_db;

USE vaccination_db;

CREATE TABLE admin (
    admin_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE user (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    phone VARCHAR(15)
);

CREATE TABLE vaccination_center (
    center_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    center_name VARCHAR(150) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    pincode VARCHAR(10) NOT NULL,
    contact_number VARCHAR(15)
);

CREATE TABLE vaccine (
    vaccine_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    vaccine_name VARCHAR(150) NOT NULL,
    manufacturer VARCHAR(150),
    description VARCHAR(500)
);

CREATE TABLE slot (
    slot_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    center_id BIGINT NOT NULL,
    vaccine_id BIGINT NOT NULL,
    slot_date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    available_slots INT NOT NULL,
    FOREIGN KEY (center_id) REFERENCES vaccination_center(center_id),
    FOREIGN KEY (vaccine_id) REFERENCES vaccine(vaccine_id)
);

CREATE TABLE booking (
    booking_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    slot_id BIGINT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(30) DEFAULT 'BOOKED',
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (slot_id) REFERENCES slot(slot_id)
);