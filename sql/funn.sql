CREATE DATABASE historiske_gjenstander;

USE historiske_gjenstander;

CREATE TABLE personer (
    id INT PRIMARY KEY,
    navn VARCHAR(100),
    telefonnummer VARCHAR(20),
    epost VARCHAR(100)
);

CREATE TABLE museer (
    id INT PRIMARY KEY,
    navn VARCHAR(100),
    sted VARCHAR(100)
);

CREATE TABLE funn (
    id INT PRIMARY KEY,
    type VARCHAR(20),
    koordinater VARCHAR(50),
    person_id INT,
    dato DATE,
    arstall INT,
    museum_id INT,
    egenskaper TEXT,
    FOREIGN KEY (person_id) REFERENCES personer(id),
    FOREIGN KEY (museum_id) REFERENCES museer(id)
);
