
a partir daqui começa a configuração do banco

 `id` int(11) NOT NULL auto_increment,
create table topicos(
  id int(11) NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(255),
  id_usuario int(11),
  primary key (id)
)ENGINE = innodb;

insert into topicos (descricao) VALUES("teste 2");

create table comentarios(
  id int(11) NOT NULL AUTO_INCREMENT,
  comentario VARCHAR(255),
  id_Usuario int(11),
  id_topico int(11),
  primary key (id)
)ENGINE = innodb;

usuarios;

create table usuarios (
  id int(11) NOT NULL AUTO_INCREMENT,
  usuario VARCHAR(255),
  senha VARCHAR(255),
  primary key (id)
)ENGINE = innodb;

CHAVES ESTRANGEIRAS
ALTER TABLE `topicos` ADD CONSTRAINT `fk_id_usuario` FOREIGN KEY ( `id` ) REFERENCES `topicos` ( `id` ) ;

create table usuarios (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  senha VARCHAR(255),
  primary key (id)
)ENGINE = innodb;
