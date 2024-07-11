-- DROP DATABASE IF EXISTS academy;
-- CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

-- EXERCISE 1

CREATE TABLE Province (
    acronym VARCHAR(2),
    province_name VARCHAR(255),
    habitants_number INT
);

-- EXERCISE 2

CREATE TABLE IF NOT EXISTS Province (
    acronym VARCHAR(2),
    province_name VARCHAR(255),
    habitants_number INT
);

-- EXERCISE 3

CREATE TABLE Persone (
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INT,
    gender ENUM('F','M')
);