USE softblue;

SELECT * FROM aluno;
UPDATE aluno SET endereco = 'Av. Brasil 778' WHERE aluno = 'José';
UPDATE aluno SET email = 'cristiano@softblue.com.br' WHERE aluno = 'Cris';

SET SQL_SAFE_UPDATES = 0;
UPDATE curso SET valor = valor * 1.1 WHERE valor < 300;
SELECT * FROM curso;

UPDATE curso SET curso = 'PHP Fundamentos' WHERE codigo = 4;
SELECT * FROM curso;
