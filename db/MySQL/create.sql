DROP DATABASE IF EXISTS Login;

CREATE DATABASE Login;

USE Login;

CREATE TABLE Cliente(
	id bigint not null auto_increment,
	email varchar(256) not null, 
	senha varchar(64) not null,
	nome varchar(256) not null,
	CPF varchar(20) not null unique, 
	adm bit not null,
	telefone varchar(20) not null,
	sexo varchar(20) not null,
	nascimento varchar(20) not null,
	primary key (id)
);

CREATE TABLE Prestador(
	id bigint not null auto_increment,
	email varchar(256) not null, 
	senha varchar(64) not null,
	nome varchar(256) not null,
	CPF varchar(20) not null unique, 
	area varchar(20) not null, 
	especialidade varchar(40) not null, 
	primary key (id)
);

INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('rafaelturyminatel@gmail.com', 'admin', 'Rafael', '84896039300', 1, '40028922', 'masculino', '23111998');
INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('pedro@gmail.com', 'cliente', 'Pedrinho', '84896039300', 0, '40028922', 'masculino', '23111998');

INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('medico@gmail.com', 'worker', 'Ricardão', '84896039300', 'médico', 'pneumologista');
