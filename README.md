
# Escola API

Bem-vindo ao repositório da **Escola API**! Este projeto é uma aplicação RESTful desenvolvida em Java com Spring Boot, focada no gerenciamento de cadastros de alunos.

## Funcionalidades

A API oferece as seguintes funcionalidades:

- Cadastro de aluno
- Consulta de aluno por ID
- Alteração de dados do aluno
- Exclusão de aluno por ID
- Listagem de todos os alunos

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.2
- MySQL
- Swagger/OpenAPI
- Heroku

## Documentação da API

A documentação da API gerada pelo Swagger pode ser acessada através do seguinte link:

[Swagger Documentation](https://desafio-aws-java-660593566198.herokuapp.com/swagger-ui.html)

## Endpoints Principais

- `POST /aluno/incluir` - Cadastra um novo aluno
- `GET /aluno/{id}` - Retorna os dados de um aluno específico
- `PUT /aluno/alterar` - Atualiza os dados de um aluno existente
- `DELETE /aluno/excluir/{id}` - Exclui um aluno pelo ID
- `GET /aluno` - Lista todos os alunos cadastrados

## Deploy no Heroku

A aplicação está em produção no Heroku e pode ser acessada através do seguinte link:

[Acesse a Aplicação](https://desafio-aws-java-660593566198.herokuapp.com)

## Como Executar o Projeto Localmente

1. Clone o repositório
2. Configure o banco de dados MySQL no arquivo `application.properties`
3. Execute os comandos:

```bash
mvn clean install
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Autor

Desenvolvido por Rafael Vitor de Oliveira. [LinkedIn](https://www.linkedin.com/in/rafaelvitor2/)
