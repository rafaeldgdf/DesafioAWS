
# Escola API

Bem-vindo ao repositório da **Escola API**! Este projeto é uma aplicação RESTful desenvolvida em Java com Spring Boot, focada no gerenciamento de cadastros de alunos.

## Funcionalidades

A API oferece as seguintes funcionalidades:

- Cadastro de aluno
- Consulta de aluno por ID
- Alteração de dados do aluno
- Exclusão de aluno por ID
- Listagem de todos os alunos

## Tratamento de Exceções

A aplicação inclui validações e tratamento de exceções para garantir a integridade dos dados de `AlunoEntity`. As principais exceções tratadas incluem:

- **Aluno com ID não encontrado:** Quando o ID do aluno não é encontrado no banco de dados, uma exceção é lançada com a mensagem `"Aluno com ID {id} não encontrado"`.
- **ID nulo na atualização:** Caso o ID do aluno seja nulo ao tentar atualizar os dados, uma exceção é lançada com a mensagem `"ID do aluno não pode ser nulo para atualização"`.
- **Nome inválido:** O nome do aluno é obrigatório e deve ter entre 3 e 50 caracteres. Caso contrário, uma exceção é lançada.
- **Idade inválida:** A idade do aluno deve ser maior que 0. Uma exceção é lançada se a idade for nula ou menor/igual a 0.
- **Notas inválidas:** As notas dos semestres devem estar entre 0 e 10. Se as notas estiverem fora desse intervalo, uma exceção é lançada.
- **Nome do professor inválido:** O nome do professor é obrigatório e deve ter entre 3 e 50 caracteres. Se não atender a esses critérios, uma exceção é lançada.
- **Número da sala inválido:** O número da sala é obrigatório e deve ter entre 1 e 10 caracteres. Uma exceção é lançada caso essas condições não sejam atendidas.

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

## Autor

Desenvolvido por Rafael Vitor de Oliveira. [LinkedIn](https://www.linkedin.com/in/rafaelvitor2/)
