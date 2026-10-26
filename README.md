# API-Cadastro

API REST desenvolvida em Java com Spring Boot para cadastro, consulta, atualização e exclusão de registros. O projeto utiliza uma arquitetura em camadas, validação de dados e persistência em banco de dados relacional.

## Tecnologias utilizadas

- **Java 17** — linguagem de programação
- **Spring Boot** — desenvolvimento da aplicação backend
- **Spring Web MVC** — criação dos endpoints REST
- **Spring Data JPA / Hibernate** — persistência e mapeamento objeto-relacional
- **MariaDB** — banco de dados relacional
- **Bean Validation** — validação dos dados recebidos
- **Lombok** — redução de código repetitivo
- **Maven** — gerenciamento de dependências e build

## Funcionalidades

- **Create:** cadastro de novos registros.
- **Read:** consulta de registros por identificador.
- **Update:** atualização de registros existentes.
- **Delete:** exclusão de registros.
- Validação de campos obrigatórios, formato de e-mail e requisitos de senha.
- Tratamento global de exceções.
- Separação das responsabilidades entre controller, service, repository e entity.

## Endpoints

A API possui os seguintes endpoints:

| Método HTTP | Endpoint | Função |
|---|---|---|
| `POST` | `/menu/post` | Cadastrar um registro |
| `GET` | `/menu/get/{id}` | Consultar um registro pelo ID |
| `PUT` | `/menu/put/{id}` | Atualizar um registro |
| `DELETE` | `/menu/delete/{id}` | Excluir um registro |

O identificador `{id}` deve ser substituído pelo ID do registro desejado.

## Arquitetura do projeto

O projeto organiza o código em camadas:

- **Controller:** recebe as requisições HTTP e direciona as operações.
- **Service:** concentra regras de negócio e validações.
- **Repository:** realiza operações de persistência utilizando JPA e `EntityManager`.
- **Entity:** representa os dados mapeados para o banco de dados.
- **Exception:** reúne exceções personalizadas e tratamento global de erros.

## Como executar

1. Instale o JDK 17 ou compatível com a configuração do projeto.
2. Instale e configure o MariaDB.
3. Configure as credenciais e a conexão com o banco em `application.properties`.
4. Abra o projeto no IntelliJ IDEA ou em outra IDE compatível com Maven.
5. Aguarde o Maven resolver as dependências.
6. Execute a classe principal da aplicação Spring Boot.
7. Utilize Postman ou outra ferramenta HTTP para testar os endpoints.

## Objetivo

Este projeto foi desenvolvido para praticar conceitos de desenvolvimento backend com Java, construção de APIs REST, operações CRUD, persistência de dados, validação e organização de aplicações Spring Boot.

## Próximas melhorias

- Implementar testes automatizados para os endpoints e regras de negócio.
- Padronizar as respostas HTTP utilizando `ResponseEntity`.
- Criar DTOs para separar os dados da API das entidades do banco.
- Melhorar o tratamento de registros inexistentes e erros de validação.
- Reforçar a proteção de informações sensíveis.
- Avaliar a implementação de autenticação e autorização com Spring Security.

---

**Status:** projeto em desenvolvimento e aprendizado de tecnologias backend.
