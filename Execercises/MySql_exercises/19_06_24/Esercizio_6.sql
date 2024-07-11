DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

CREATE TABLE Country(
	id_country VARCHAR(2) NOT NULL,
    state VARCHAR(255) NOT NULL,
    id_region DECIMAL(10,0) DEFAULT NULL,
    PRIMARY KEY(id_country,state)
);

INSERT INTO Country(id_country,state) VALUES
("10","AAAAA"),
("20","BBBBB"),
("30","CCCCC");

-- ESERCIZIO 1

UPDATE Country
SET id_region = 100
WHERE id_country = "10" AND state = "AAAAA";

-- ESERCIZIO 2

DELETE 
FROM Country
WHERE id_country = "30";

SELECT * FROM Country;