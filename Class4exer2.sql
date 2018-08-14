USE softblue;

SELECT * FROM aluno;

SELECT curso FROM curso;

SELECT curso, valor FROM curso WHERE valor > 200;

SELECT curso, valor FROM curso WHERE valor > 200 and valor < 300;

SELECT curso, valor FROM curso WHERE valor BETWEEN 200 AND 300;

SELECT * FROM pedido WHERE datahora > '2010-04-15' AND datahora < '2010-04-19';

SELECT * FROM pedido WHERE datahora BETWEEN '2010-04-15' AND '2010-04-19';

SELECT * FROM pedido WHERE DATE(datahora) = '2010-04-15';