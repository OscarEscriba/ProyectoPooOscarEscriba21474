create database proyectoss; 
use proyectoss; 
create table medico (  
id int auto_increment primary key, 
nombre varchar(255) not null, 
especialidad varchar(255) not null, 
ubicacion varchar(255) not null 
);  
create table pacientes(  
id int auto_increment primary key, 
nombre varchar(255) not null, 
sintomas TEXT, 
medicamentos_consumidos TEXT
);  

create table farmacia ( 
id int auto_increment primary key, 
ubicaciones TEXT
); 