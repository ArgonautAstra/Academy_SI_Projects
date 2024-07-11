DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

CREATE TABLE Country(
	id_country VARCHAR(2) NOT NULL,
    state VARCHAR(255) NOT NULL,
    id_regione DECIMAL(10,0) DEFAULT NULL,
    PRIMARY KEY(id_country,state)
);

INSERT INTO Country VALUES
(10,"AAAAA",100),
(20,"BBBBB",100),
(30,"CCCCC",100);

-- ESERCIZIO 1

CREATE TABLE Country_Duplicate(
	id_country VARCHAR(2) NOT NULL,
    state VARCHAR(255) NOT NULL,
    id_regione DECIMAL(10,0) DEFAULT NULL,
    PRIMARY KEY(id_country,state)
);

INSERT INTO Country_Duplicate
SELECT * 
FROM Country;

CREATE TABLE IF NOT EXISTS Country_Duplicate_2 AS
SELECT *
FROM Country;

SELECT * FROM Country_Duplicate;

SELECT * FROM Country_Duplicate_2;
