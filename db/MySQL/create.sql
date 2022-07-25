DROP DATABASE IF EXISTS Login;

CREATE DATABASE Login;

USE Login;

CREATE TABLE Usuario(id bigint not null auto_increment, nome varchar(256) not null, email varchar(256) not null, login varchar(20) not null unique, senha varchar(64) not null, papel varchar(10) not null, primary key (id));
CREATE TABLE Prestador(id bigint not null auto_increment, nome varchar(256) not null, email varchar(256) not null, login varchar(20) not null unique, senha varchar(64) not null, macro varchar(20) not null, micro varchar(40), primary key (id));

INSERT INTO Usuario(nome, email, login, senha, papel) VALUES ('Administrador', 'sonaejc@estudante.ufscar.br', 'admin', 'admin', 'ADMIN');
INSERT INTO Usuario(nome, email, login, senha, papel) VALUES ('Usuario de Teste', 'testuser@unexistent.com', 'consumer', 'consumer', 'USER');
INSERT INTO Prestador(nome, email, login, senha, macro, micro) VALUES ('Prestador de Teste', 'testworker@unexistent.com', 'worker', 'worker', 'médico', 'pneumologista');
