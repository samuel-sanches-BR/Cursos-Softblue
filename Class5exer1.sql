USE softblue;

SELECT * FROM curso;
SELECT * FROM tipo;
SELECT * FROM instrutor;
SELECT * FROM pedido;
SELECT * FROM pedido_detalhe;
SELECT * FROM aluno;


SELECT curso.curso, tipo.tipo FROM curso INNER JOIN tipo ON curso.tipo = tipo.codigo;

SELECT curso.curso, tipo.tipo, instrutor.instrutor, instrutor.telefone FROM curso 
INNER JOIN tipo ON curso.tipo = tipo.codigo
INNER JOIN instrutor ON curso.instrutor = instrutor.codigo;

SELECT codigo, datahora, curso FROM pedido INNER JOIN pedido_detalhe ON pedido.codigo = pedido_detalhe.pedido;

SELECT pedido.codigo, datahora, curso.curso FROM pedido 
INNER JOIN pedido_detalhe ON pedido.codigo = pedido_detalhe.pedido
INNER JOIN curso ON pedido_detalhe.curso = curso.codigo;

SELECT pedido.codigo, datahora, aluno.aluno, curso.curso FROM pedido 
INNER JOIN pedido_detalhe ON pedido.codigo = pedido_detalhe.pedido
INNER JOIN curso ON pedido_detalhe.curso = curso.codigo
INNER JOIN aluno ON aluno.codigo = pedido.aluno;