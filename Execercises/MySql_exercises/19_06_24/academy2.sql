DROP DATABASE IF EXISTS academy;
CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

CREATE TABLE IF NOT EXISTS User(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstname VARCHAR(255) DEFAULT NULL,
    lastname VARCHAR(255) DEFAULT NULL,
    email VARCHAR(255) DEFAULT NULL,
    password VARCHAR(255) DEFAULT NULL
);

INSERT INTO User(firstname, lastname, email, password) VALUES
("Mario", "Rossi", "mariorossi@gmail.com", "{noop}Mario123"),
("Luigi", "Verdi", "luigiverdi@gmail.com", "{noop}Luigi123"),
("Claudio", "Bianchi", "claudiobianchi@gmail.com", "{noop}Claudio123"),
("Marta", "Neri", "martaneri@gmail.com", "{noop}Marta123"),
("Marco", "Gialli", "marcogialli@gmail.com", "{noop}Marco123");

SELECT *
FROM User;