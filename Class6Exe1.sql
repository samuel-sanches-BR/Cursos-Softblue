USE softblue;

SELECT * FROM pedido;
SELECT DISTINCT(aluno.aluno) FROM pedido INNER JOIN aluno ON pedido.aluno = aluno.codigo; 

SELECT DISTINCT(aluno.aluno) FROM pedido INNER JOIN aluno ON pedido.aluno = aluno.codigo ORDER BY datahora LIMIT 1;

SELECT DISTINCT(aluno.aluno) FROM pedido INNER JOIN aluno ON pedido.aluno = aluno.codigo ORDER BY datahora DESC LIMIT 2, 1;

SELECT COUNT(*) FROM pedido_detalhe;

SELECT SUM(valor) FROM pedido_detalhe;

SELECT AVG(valor) FROM pedido_detalhe WHERE pedido = 2;

SELECT MAX(valor) FROM curso;

SELECT MIN(valor) FROM curso;

SELECT pedido, SUM(valor) FROM pedido_detalhe GROUP BY pedido;

SELECT instrutor.instrutor, COUNT(*) FROM curso 
INNER JOIN instrutor ON curso.instrutor = instrutor.codigo GROUP BY instrutor;

SELECT pedido, aluno.aluno, SUM(valor) FROM pedido_detalhe 
INNER JOIN pedido ON pedido_detalhe.pedido = pedido.codigo 
INNER JOIN aluno ON pedido.aluno = aluno.codigo GROUP BY pedido HAVING SUM(valor) > 500;

SELECT pedido, aluno.aluno, COUNT(*) FROM pedido_detalhe 
INNER JOIN pedido ON pedido_detalhe.pedido = pedido.codigo 
INNER JOIN aluno ON pedido.aluno = aluno.codigo GROUP BY pedido HAVING COUNT(*) > 1;

SELECT aluno, endereco FROM aluno WHERE endereco LIKE 'Av%';

SELECT curso FROM curso WHERE curso LIKE '%java%';