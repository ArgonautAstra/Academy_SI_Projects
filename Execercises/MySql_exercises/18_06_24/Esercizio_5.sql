DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

CREATE TABLE Department (
    id_department INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_department VARCHAR(255)
);

CREATE TABLE Supplier (
    id_supplier INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_supplier VARCHAR(255) NOT NULL,
    contact_supplier VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE Place (
    id_place INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_place VARCHAR(127) NOT NULL,
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

-- EXERCISE 1

ALTER TABLE Department
ADD COLUMN code_department INT NOT NULL;

ALTER TABLE Supplier
DROP COLUMN address;

-- EXERCISE 2

ALTER TABLE Place
ADD COLUMN region VARCHAR(255) NOT NULL,
ADD COLUMN province VARCHAR(255) NOT NULL;

ALTER TABLE Squad
ADD COLUMN color ENUM("Rosso","Arancione","Verde") NOT NULL;

ALTER TABLE Place
MODIFY name_place VARCHAR(255) NOT NULL;
