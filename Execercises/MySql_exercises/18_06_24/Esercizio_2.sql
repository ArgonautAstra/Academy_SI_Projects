-- DROP DATABASE IF EXISTS academy;
-- CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

-- EXERCISE 1

CREATE TABLE Job (
    id_employee INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    id_work INT NOT NULL,
    id_department INT NOT NULL
);