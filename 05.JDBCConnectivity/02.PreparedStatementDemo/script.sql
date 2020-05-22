create database JavaJDBC;
use JavaJDBC;

CREATE TABLE contacts (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(25) NOT NULL,
    phone varchar(25) Not NULL,
    PRIMARY KEY (id)
);