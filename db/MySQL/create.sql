DROP DATABASE IF EXISTS Login;

CREATE DATABASE Login;

USE Login;

CREATE TABLE Usuario(id bigint not null auto_increment, nome varchar(256) not null, email varchar(256) not null, login varchar(20) not null unique, senha varchar(64) not null, papel varchar(10), primary key (id));
INSERT INTO Usuario(nome, email, login, senha, papel) VALUES ('Administrador', 'sonaejc@estudante.ufscar.br', 'admin', 'admin', 'ADMIN');
INSERT INTO Usuario(nome, email, login, senha, papel) VALUES ('Usuario', 'testuser@unexistent.com', 'user', 'user', 'USER');
