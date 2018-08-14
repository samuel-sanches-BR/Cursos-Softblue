USE softblue;

SELECT * FROM curso;

SELECT curso, 
	(
		SELECT MIN(valor) FROM pedido_detalhe WHERE pedido_detalhe.curso = curso.codigo
	) AS menor_valor FROM curso;

SELECT curso FROM curso 
WHERE tipo IN 
	(
		SELECT codigo FROM tipo WHERE tipo = 'Programação'
	);

SELECT curso FROM curso 
WHERE EXISTS 
	(
		SELECT codigo FROM tipo WHERE tipo.codigo = curso.tipo AND tipo.tipo = 'Programação'
	);
    
SELECT instrutor, 
	(
		SELECT SUM(pedido_detalhe.valor) FROM pedido_detalhe 
        INNER JOIN curso ON pedido_detalhe.curso = curso.codigo WHERE curso.instrutor = instrutor.codigo
	) AS total_vendas FROM instrutor;

CREATE VIEW alunos_comprou AS SELECT aluno, 
	(
		SELECT SUM(pedido_detalhe.valor) FROM pedido_detalhe 
        INNER JOIN pedido ON pedido_detalhe.pedido = pedido.codigo 
        WHERE pedido.aluno = aluno.codigo
	) AS total_comprou FROM aluno;

SELECT * FROM alunos_comprou;