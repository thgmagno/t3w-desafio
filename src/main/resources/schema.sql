CREATE TABLE pessoa
(
    id   INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    cpf  VARCHAR(11)  NOT NULL,
    nome VARCHAR(250) NOT NULL
);

CREATE TABLE produto
(
    id             INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    descricao      VARCHAR(50)    NOT NULL,
    valor_unitario NUMERIC(10, 2) NOT NULL
);

CREATE TABLE pedido
(
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    pessoa_id INTEGER NOT NULL,
    valor_total NUMERIC(10, 2) NOT NULL
);

ALTER TABLE pedido ADD CONSTRAINT fk_pessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa(id) ON DELETE CASCADE;

CREATE TABLE pedido_item
(
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    pedido_id INTEGER NOT NULL,
    produto_id INTEGER NOT NULL,
    quantidade INTEGER NOT NULL
);

ALTER TABLE pedido_item ADD CONSTRAINT fk_pedido FOREIGN KEY (pedido_id) REFERENCES pedido(id) ON DELETE CASCADE;
ALTER TABLE pedido_item ADD CONSTRAINT fk_produto FOREIGN KEY (produto_id) REFERENCES produto(id) ON DELETE CASCADE;