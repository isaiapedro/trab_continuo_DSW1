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

INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('rafael@mail.com', 'admin', 'Rafael', '84896039300', 1, '40028922', 'Masculino', '23111998');

INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('pedro@mail.com', 'cliente', 'Pedrinho', '848961345300', 0, '45028922', 'Masculino', '23111998');
INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('claudia@mail.com', 'cliente', 'Claudia', '99896139300', 0, '41128922', 'Feminino', '23111998');
INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('pedro@mail.com', 'cliente', 'Pedrinho', '81896139300', 0, '46028922', 'Feminino', '23111998');
INSERT INTO Cliente(email, senha, nome, CPF, adm, telefone, sexo, nascimento) VALUES ('pedro@mail.com', 'cliente', 'Pedrinho', '88896139300', 0, '43028922', 'Masculino', '23111998');

INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('medico@mail.com', 'worker', 'Ricardao', '12346039300', 'médico', 'pneumologista');
INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('psico@mail.com', 'worker2', 'Paula', '84892039300', 'psicologa', 'infantil');
INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('claudio@mail.com', 'worker3', 'Pedro', '84816039300', 'médico', 'ortopedista');
INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('joao@mail.com', 'worker4', 'João', '84896039300', 'médico', 'dermatologista');
INSERT INTO Prestador(email, senha, nome, CPF, area, especialidade) VALUES ('bruno@mail.com', 'worker5', 'Bruno', '66696039300', 'médico', 'pediatra');
