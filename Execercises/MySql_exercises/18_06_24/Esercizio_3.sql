-- DROP DATABASE IF EXISTS academy;
-- CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

-- EXERCISE 1

CREATE TABLE Department (
    id_department INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_department VARCHAR(255)
);

CREATE TABLE Supplier (
    id_supplier INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_supplier VARCHAR(255) NOT NULL,
    contact_supplier VARCHAR(255) NOT NULL
);

-- EXERCISE 2

CREATE TABLE Degree_Course (
    id_degreee_course INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_degreee_course VARCHAR(255) NOT NULL
);

CREATE TABLE Curriculum (
    id_curriculum INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    class_curriculum VARCHAR(255) NOT NULL,
    number_curriculum VARCHAR(255) NOT NULL,
    name_curriculum VARCHAR(255) NOT NULL,
    period VARCHAR(255) NOT NULL,
    id_degreee_course INT NOT NULL,
    FOREIGN KEY(id_degreee_course) REFERENCES Curriculum(id_degreee_course)
);

CREATE TABLE Teacher (
    id_teacher INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    birthdate DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    degree VARCHAR(255) NOT NULL
);

CREATE TABLE Student (
    id_student INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    birthdate DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    id_curriculum INT NOT NULL,
    FOREIGN KEY(id_curriculum) REFERENCES Curriculum(id_curriculum)
);

-- EXERCISE 3

CREATE TABLE Place (
    id_place INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_place VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE Squad (
    id_squad INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_squad VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL
);

CREATE TABLE Championship (
    name_championship VARCHAR(255) NOT NULL,
    year_championship INT NOT NULL,
    id_place INT NOT NULL,
    PRIMARY KEY(name_championship, year_championship),
    FOREIGN KEY (id_place) REFERENCES Place(id_place)
);