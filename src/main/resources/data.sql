INSERT INTO pessoa (cpf, nome)
VALUES
    ('56637927082', 'Pessoa 1'),
    ('56637927082', 'Pessoa 2'),
    ('12312312312', 'Pessoa 3');

INSERT INTO produto (descricao, valor_unitario)
VALUES
    ('Produto 1', 10.0),
    ('Produto 2', 20.0),
    ('Produto 3', 20.0);

INSERT INTO pedido (pessoa_id, valor_total)
VALUES
    (1, 30.0),
    (2, 20.0);

INSERT INTO pedido_item (pedido_id, produto_id, quantidade)
VALUES
    (1, 1, 1),
    (1, 2, 1),
    (2, 3, 1);
