--SELECT * FROM cliente;
--SELECT * FROM funcionario;
--SELECT * FROM material;
--SELECT * FROM produto;
--SELECT * FROM pedido;

--os código abaixo servem para testar os 3 relátorios do trabalho, é só uma prova real.
--produtos com o material mediano (qualidadematerial = 'mediano')
--SELECT codigoproduto, modelo, codigoMaterial FROM  produto NATURAL JOIN material WHERE qualidadematerial='mediano';

--relatorio pedidos dos clientes com nome Murilo.
--SELECT codigopedido, codigocliente FROM pedido NATURAL JOIN cliente WHERE nomecliente='murilo';

--relatorio pedidos com produto de tamanho pequeno
--SELECT codigopedido, codigoproduto FROM pedido NATURAL JOIN produto WHERE tamanho='pequeno';