USE softblue;

SELECT * FROM curso;
SELECT * FROM tipo;


CREATE VIEW titutlo_preco_eh_programacao AS SELECT curso, valor FROM curso WHERE curso.tipo = 2;
SELECT * FROM titutlo_preco_eh_programacao;

CREATE VIEW titutlo_tipo_instrutor AS SELECT curso, tipo.tipo, instrutor.instrutor FROM curso 
INNER JOIN instrutor ON instrutor.codigo = curso.instrutor 
INNER JOIN tipo ON tipo.codigo = curso.tipo;
SELECT * FROM titutlo_tipo_instrutor;

CREATE VIEW aluno_data_codigo_pedido AS SELECT aluno.aluno, pedido.datahora, pedido.codigo FROM aluno INNER JOIN pedido ON pedido.aluno = aluno.codigo;
SELECT * FROM aluno_data_codigo_pedido;