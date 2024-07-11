-- DROP DATABASE IF EXISTS academy;
-- CREATE DATABASE academy;

-- CREATE DATABASE IF NOT EXISTS academy;

USE academy;

SELECT lastname, COUNT(title) as readed
FROM P 
JOIN U ON P.id_user = U.id_user 
JOIN L ON P.id_book = L.id_book 
GROUP BY lastname
ORDER BY readed DESC
LIMIT 3;

SELECT *
FROM P;

-- ESERCIZIO 1

SELECT FIRST_NAME, LAST_NAME, employees.JOB_ID, JOB_TITLE 
FROM employees
JOIN jobs ON employees.JOB_ID = jobs.JOB_ID
JOIN departments ON employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
JOIN locations ON departments.LOCATION_ID = locations.LOCATION_ID
WHERE CITY = "London";

-- ESERCIZIO 2

SELECT employees.EMPLOYEE_ID, 
	   employees.LAST_NAME AS EMPLOYEE_LASTNAME, 
	   manager.EMPLOYEE_ID AS MANAGER_ID, 
	   manager.LAST_NAME AS MANAGER_LASTNAME
FROM employees
JOIN employees AS manager ON employees.MANAGER_ID = manager.EMPLOYEE_ID
ORDER BY manager.EMPLOYEE_ID;

-- ESERCIZIO 3

SELECT FIRST_NAME, LAST_NAME, JOB_TITLE, HIRE_DATE, SALARY
FROM employees
JOIN jobs ON employees.JOB_ID = jobs.JOB_ID
WHERE JOB_TITLE LIKE "%Manager"
AND YEAR(CURRENT_DATE()) - YEAR(HIRE_DATE) >= 15;

-- ESERCIZIO 4

SELECT departments.DEPARTMENT_ID, DEPARTMENT_NAME, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE
FROM departments
NATURAL JOIN locations; 
-- JOIN locations ON departments.LOCATION_ID = locations.LOCATION_ID;

-- ESERCIZIO 5

SELECT job_history.EMPLOYEE_ID, job_history.JOB_ID, START_DATE, END_DATE
FROM job_history
JOIN employees ON job_history.EMPLOYEE_ID = employees.EMPLOYEE_ID
WHERE SALARY > 10000;

INSERT INTO cliente VALUES
(1,"Mario","Rossi","mariorossi@gmail.com","111 111111"),
(2,"Luigi","Verdi","luigiverdi@gmail.com","222 222222"),
(3,"Luca","Bianchi","lucabianchi@gmail.com","333 333333");
