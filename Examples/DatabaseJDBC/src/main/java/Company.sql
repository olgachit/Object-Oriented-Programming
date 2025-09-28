DROP DATABASE IF EXISTS company;
CREATE DATABASE company;
USE company;

CREATE TABLE EMPLOYEE (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO EMPLOYEE (first_name, last_name, email, salary) VALUES
    ('John', 'Doe', 'johndoe@somemail.com', 1000.00),
    ('Mary', 'Smith', 'msmith@goodmail.com', 2000.00),
    ('Peter', 'Jones', 'peterjones@greatmail.com', 3000.00); 
    
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'OLga123!';
GRANT SELECT, INSERT, UPDATE, DELETE ON company.* TO 'appuser'@'139.112.64.8';
GRANT SELECT company.employee TO 'appuser'@'139.112.64.8';

