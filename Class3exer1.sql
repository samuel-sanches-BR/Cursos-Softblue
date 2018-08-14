CREATE DATABASE softblue;

USE softblue;

CREATE TABLE tipo
(
	codigo int unsigned not null auto_increment,
    tipo varchar(45) not null,
    PRIMARY KEY (codigo)
);

CREATE TABLE instrutor
(
	codigo int unsigned not null auto_increment,
    instrutor varchar(65) not null,
    telefone varchar(20) null,
    PRIMARY KEY (codigo)
);

CREATE TABLE curso
(
	codigo int unsigned not null auto_increment,
    curso varchar(25) not null,
    tipo int unsigned not null,
    instrutor int unsigned not null,
    valor double not null,
    PRIMARY KEY (codigo),
    FOREIGN KEY (tipo) REFERENCES tipo (codigo),
    FOREIGN KEY (instrutor) REFERENCES instrutor (codigo)
);

CREATE TABLE aluno
(
	codigo int unsigned not null auto_increment,
    aluno varchar(80) not null,
    endereco varchar(100) not null,
    email varchar(40) not null,
    PRIMARY KEY (codigo)
);

CREATE TABLE pedido
(
	codigo int unsigned not null auto_increment,
    aluno int unsigned not null,
    datahora datetime not null,
    PRIMARY KEY (codigo),
    FOREIGN KEY (aluno) REFERENCES aluno (codigo)
);

CREATE TABLE pedido_detalhe
(
	pedido int unsigned not null,
    curso int unsigned not null,
    valor double not null,
    PRIMARY KEY (pedido, curso),
    FOREIGN KEY (pedido) REFERENCES pedido (codigo),
    FOREIGN KEY (curso) REFERENCES curso (codigo)
);

CREATE INDEX fk_tipo ON curso (tipo);
CREATE INDEX fk_instrutor ON curso (instrutor);
CREATE INDEX fk_aluno ON pedido (aluno);
CREATE INDEX fk_pedido ON pedido_detalhe (pedido);
CREATE INDEX fk_curso ON pedido_detalhe (curso);