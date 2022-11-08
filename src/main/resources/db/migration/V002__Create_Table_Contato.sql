CREATE TABLE IF NOT EXISTS Contato (
    id BIGINT NOT NULL AUTO_INCREMENT,
    clienteId BIGINT NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    contato VARCHAR(100) NOT NULL,
    PRIMARY KEY(ID)
);

ALTER TABLE Contato ADD CONSTRAINT fk_contato_cliente
FOREIGN KEY(clienteId) REFERENCES Cliente(id);

INSERT INTO Contato(clienteId, descricao, contato) VALUES
    (1, "telefone", "14888889999"),
    (3, "telefone", "52787879090"),
    (2, "e-mail", "luthur.silva@gmail.com"),
    (5, "e-mail", "micrtion@gmail.com"),
    (4, "telefone", "11667783646");
