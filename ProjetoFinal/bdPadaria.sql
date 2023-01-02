CREATE DATABASE bdPadaria;
USE bdPadaria;

CREATE TABLE adm (
cod_adm int AUTO_INCREMENT PRIMARY KEY,
nome_adm VARCHAR (45),
senha_adm VARCHAR (8));


SELECT *FROM adm;

INSERT INTO adm (nome_adm, senha_adm) VALUES
("admin", "admin123");


create table prod(
id_prod int AUTO_INCREMENT PRIMARY KEY, 
nome_prod VARCHAR(45),
unidadeMed_prod char(2),
valor_prod decimal(5,2)
);


ALTER TABLE pedido ADD CONSTRAINT fk_cidade FOREIGN KEY (id_mesa) REFERENCES prod (id_prod);

drop table pedido, prod;

create table pedido(
id_mesa int DEFAULT '1' ,
num_pedido int AUTO_INCREMENT PRIMARY KEY,
produto_pedido  VARCHAR (45),
valor double(5,2),
quantidade_pedido  int,
tipoPedido_pedido VARCHAR(25),
preco_pedido double(5,2)
);

DROP TABLE pedido;

SELECT *FROM pedido WHERE id_mesa = 1; 

SELECT *FROM pedido;

INSERT INTO pedido (produto_pedido, quantidade_pedido, tipoPedido_pedido, preco_pedido) VALUES
("pao", 2, "LEVar", 50.00);

create table tb_func (
id_func int auto_increment primary key,
nome_func varchar(50),
senha_func varchar(15),
cargo_func varchar(20)
);

INSERT INTO tb_func (nome_func ,senha_func) VALUES ("func","func123");

SELECT *FROM tb_func;