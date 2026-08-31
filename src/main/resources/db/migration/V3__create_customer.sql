CREATE TABLE customer (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO customer (name, email)
VALUES
    ('Ana Silva', 'ana.silva@email.com'),
    ('Bruno Costa', 'bruno.costa@email.com'),
    ('Carla Mendes', 'carla.mendes@email.com'),
    ('Diego Pereira', 'diego.pereira@email.com'),
    ('Eduarda Rocha', 'eduarda.rocha@email.com');
