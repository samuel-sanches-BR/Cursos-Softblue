USE softblue;

ALTER TABLE aluno ADD data_nascimento varchar(10);

ALTER TABLE aluno CHANGE COLUMN data_nascimento nascimento date;

ALTER TABLE aluno ADD INDEX index_aluno (aluno);

ALTER TABLE instrutor ADD email varchar(100);

ALTER TABLE curso ADD INDEX index_instrutor (instrutor);

ALTER TABLE instrutor DROP email;