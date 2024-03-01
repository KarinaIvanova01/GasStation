drop database if exists gas_stations;

create database gas_stations;

use gas_stations;
CREATE TABLE station
(
    id          VARCHAR(255)  null PRIMARY KEY,
    name        VARCHAR(255),
    brand       VARCHAR(255),
    street      VARCHAR(255),
    place       VARCHAR(255),
    lat         DECIMAL(10, 6),
    lng         DECIMAL(10, 6),
    dist        DECIMAL(10, 2),
    diesel      DECIMAL(10, 3),
    e5          DECIMAL(10, 3),
    e10         DECIMAL(10, 3),
    isOpen      BOOLEAN,
    houseNumber VARCHAR(255),
    postCode    int
);


