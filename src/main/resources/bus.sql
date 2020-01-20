create database if not exists busdb;
use busdb;

create table if not exists bus(
busID VARCHAR(10) PRIMARY KEY,
busName varchar(255) not null,
modelName varchar(255) not null,
route VARCHAR(255) NOT NULL,
startTime VARCHAR(255) NOT NULL,
endTime varchar(255),
offDay varchar(255),
driverNum varchar(255) UNIQUE,
parkAddr varchar(255),
busType varchar(255)
);
