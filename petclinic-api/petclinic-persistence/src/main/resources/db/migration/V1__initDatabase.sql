--drop schema if exists petclinic;
--
--create schema if not exists petclinic;

create table pet (
id integer not null primary key,
name varchar(30) not null,
species varchar(30) not null,
birth_year integer null);

create sequence if not exists pet_sequence increment by 1 owned by pet.id