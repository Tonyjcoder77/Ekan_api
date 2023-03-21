# API Beneficiario

Endpoints para executar as seguintes operações:
- Cadastrar um beneficiário junto com seus documentos;
- Listar todos os beneficiários cadastrados;
- Listar todos os documentos de um beneficiário a partir de seu id;
- Atualizar os dados cadastrais de um beneficiário;
- Remover um beneficiário.

O sistema inclui tabelas de: Beneficiario, Documentos e Usuarios
Para esta versão as tabelas estão na memoria h2.
Ao iniciar o sistema valores iniciais são carregados nas tabelas a partir do 
data.sql que fica no folder Resources.
O Usuario defalut carregado na tabela Usuarios é:

Usuario: FrontUser
Email: frontUser@email.com
Senha:123456

O controle de acesso ocorre a partir do login pela API de autenticação:
/auth

A partir do login recupera-se o token e usa nas proximas requisições

A aplicação está documentada no swagger:
http://localhost:8080/swagger-ui.html#/

Para fazer o build basta ir na opção Package->Run Maven Build
A partir daí é gerado o arquivo JAR que é o executável do projeto que 
deve ser copiado para o servidor.
É necessário antes deste procedimento gera um application.properties de produção
que apontará para o banco de dados de produção. É necessário tbem configurar as variaveis 
de ambiente no application.properties.

 

 