use ladyshoes_db;

CREATE TABLE marca (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(55) NOT NULL,
    descripcion varchar(55),
    estado varchar(55),
    PRIMARY KEY (id)
);