create database proyecto; 
use proyecto; 
create table medico (  
id int auto_increment, 
nombre varchar(255) not null, 
especialidad varchar(255) not null, 
ubicacion varchar(255) not null 
);  
create table pacientes(  
id int auto_increment, 
nombre varchar(255) not null, 
sintomas TEXT, 
medicamentos_consumidos TEXT
);  

create table farmacia ( 
id int auto_increment, 
ubicaciones TEXT
); 