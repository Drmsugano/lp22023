CREATE TABLE vendas.cidade (
	id_cidade INT auto_increment NOT NULL,
	nome varchar(200) NULL,
	cod_ibge INT NULL,
	CONSTRAINT cidade_PK PRIMARY KEY (id_cidade)
);

CREATE TABLE vendas.endereco (
	id_endereco INT auto_increment NOT NULL,
	logradouro varchar(100) NOT NULL,
	bairro varchar(100) NOT NULL,
	id_cidade INT NOT NULL,
	CONSTRAINT endereco_PK PRIMARY KEY (id_endereco),
	CONSTRAINT endereco_FK FOREIGN KEY (id_cidade) REFERENCES vendas.cidade(id_cidade)
);


