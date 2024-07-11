DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

-- EXERCISE 1

CREATE TABLE Job (
    id_employee INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    start_date DATE NOT NULL,
    end_date VARCHAR(10) CHECK(end_date LIKE '__-__-____') DEFAULT NULL,
    id_work INT NOT NULL,
    id_department INT NOT NULL
);

INSERT INTO Job(id_employee, start_date, end_date, id_work, id_department) 
VALUES(1,'2000-01-01','99-12-2020',1,1);

SELECT *
FROM Job;