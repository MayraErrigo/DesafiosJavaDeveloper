-- EJERCICIO 1 --

#1.1
CREATE DATABASE BONUS_TRACK;
#1.2
USE BONUS_TRACK;
#1.3
CREATE TABLE AGENDA(
IDContacto INT UNSIGNED PRIMARY KEY,
Nombre VARCHAR(20) NOT NULL,
Apellido VARCHAR(15) NOT NULL,
Domicilio VARCHAR(50),
Telefono INT NOT NULL
);
#1.4
/*CREATE TABLE AGENDA(
IDContacto INT PRIMARY KEY,
Nombre VARCHAR(20) NOT NULL,
Apellido VARCHAR(15) NOT NULL,
Domicilio VARCHAR(50),
Telefono INT NOT NULL
);*/
#1.5
SHOW TABLES;
#1.6
DESC AGENDA;
#1.7
ALTER TABLE AGENDA ADD COLUMN Mail VARCHAR(50) NOT NULL;
#1.8
INSERT INTO AGENDA(IDContacto, Nombre, Apellido, Domicilio, Telefono, Mail) 
VALUES (1, 'Mariela', 'Reyneri', 'Rivadavia 443', 3571528213, 'marielareyneri@gmail.com'),
(2, 'Esmeralda', 'Marín', 'Catamarca 544', 3571457896, 'esmemarin123@gmail.com'),
(3, 'Renata', 'Tosco', 'Rivadavia 200', 3571124585, 'renatatosco2@gmail.com'),
(4, 'Valentina Rocio', 'Eula', 'Tucumán 833', 357163258, 'valentinaeula@gmail.com');
SELECT * FROM AGENDA;
