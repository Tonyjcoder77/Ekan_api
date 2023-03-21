INSERT INTO USUARIO(nome, email, senha) VALUES('FrontUser', 'frontUser@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');

INSERT INTO
BENEFICIARIO(nome, telefone, data_nascimento, data_inclusao, data_atualizacao)
VALUES(
'Mario Costa',
'(011) 93333.3333',
'2019-05-05',
'2019-05-05',
'2019-05-05');

INSERT INTO
BENEFICIARIO(nome, telefone, data_nascimento, data_inclusao, data_atualizacao)
VALUES(
'Osmar Prado',
'(011) 93333.4444',
'1990-05-05',
'1990-05-05',
'1990-05-05');

INSERT INTO DOCUMENTO(tipo_documento, descricao, data_inclusao, data_atualizacao, beneficiario_id)
VALUES(
'Receita',
'Receita periodica de remedios',
'2019-05-05',
'2019-05-05',
 1);
INSERT INTO DOCUMENTO(tipo_documento, descricao, data_inclusao, data_atualizacao, beneficiario_id)
VALUES(
'Radiografia',
'Rediografia do Femur',
'2019-05-05',
'2019-05-05',
 1);
INSERT INTO DOCUMENTO(tipo_documento, descricao, data_inclusao, data_atualizacao, beneficiario_id)
VALUES(
'Exame',
'Exame de Sangue',
'2019-05-05',
'2019-05-05',
 2);
