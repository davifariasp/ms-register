<h1 align="center">
  Microsserviços com Java Spring e RabbitMQ
</h1>


<p align="center">
  <a href="#page_with_curl-sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#hammer-tecnologias">Tecnologias</a>
  &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rotating_light-importante">Importante</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#books-requisitos">Requisitos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-iniciando">Iniciando</a>
</p>

## :page_with_curl: Sobre
Esse repositório é um projeto de estudo sobre microsserviços. Nele há dois serviços, MS-User e MS-Email e a comunicação entre eles se dá através do RabbitMQ.  Para isso estou utilizando Java juntamente com o ecossistema Spring para implementar toda essa infraestrutura.

Ele é baseado na vídeoaula da [**@Michelli Brito**](https://github.com/MichelliBrito) - [**Microsserviços na prática com Java Spring**](https://www.youtube.com/watch?v=ZnECi2gatMs&t=1885s&ab_channel=MichelliBrito), mas com alguns incrementos como:
- Uso do Docker para servir os containers do PostgresSQL e do RabbitMQ;
- Uso do Lombok para reduzir a verbosidade do código;
- Uso de métodos próprios para fazer conversão de DTO para Model;
- Uso de variáveis de ambiente para armazenar credenciais do Gmail.

## :hammer: Tecnologias

- Java 23
- Maven
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Validation
- Spring AMQP
- Spring Mail
- PostgresSQL
- RabbitMQ
- SMTP Gmail
- Docker

## :books: Requisitos

As tecnologias a seguir são necessárias para conseguir rodar o projeto em sua máquina.

- Ter [**Git**](https://git-scm.com/) para clonar o projeto.
- Ter Java 23 instalado.
- Ter uma conta Google.
- Ter [**Docker**](https://www.docker.com/get-started/) para executar o projeto.

## :rotating_light: Importante

Links importantes para auxiliar a desenvolver o projeto

- [**Como colocar variáveis de ambiente no IntelliJ**](https://youtu.be/GyaE1-vbjf4?si=qTk4D91uwXceu75P&t=204)
- [**Como criar senha app google**](https://support.google.com/accounts/answer/185833)

## :rocket: Iniciando
``` bash
  # Clonar o projeto:
  $ git clone git@github.com:davifariasp/ms-register.git

  # Entrar no diretório:
  $ cd ms-register

  # Compor o projeto:
  $ docker compose up -d
  # ou
  $ make up-app
```

Agora com os containers rodando, configure as variáveis de ambiente no IntelliJ e rode o projeto. Com isso você pode rodar ambos os serviços e fazer um teste de comunicação entre eles.

### Registrar usuário
`POST - localhost:8081/user`

``` bash
    {
        "name": "Teste",
        "email": "teste@email.com"
    }
```