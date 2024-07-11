DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

-- EXERCISE 1

CREATE TABLE Job (
    id_job INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_job VARCHAR(255) DEFAULT NULL,
    min_salary DECIMAL DEFAULT 8000,
    max_salary DECIMAL CHECK(max_salary <= 25000) DEFAULT NULL
);

INSERT INTO Job(id_job, name_job, min_salary) 
VALUES(1,"Lavoro_1",8001);

SELECT *
FROM Job;