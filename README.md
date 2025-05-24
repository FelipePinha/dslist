# DSList

## Detalhes do projeto

DSList é uma aplicação back-end realizado na imersão Java Spring, evento organizado pela DevSuperior.

A aplicação consiste em uma API Rest, onde é possível realizar consultas sobre listas de games do usuário, além de alterar as posições dos jogos de uma determinada lista.

## Endpoints

### GET /lists

Retorna todas as listas

![Image](https://github.com/user-attachments/assets/8fcc4fe8-ec2a-4723-b8a6-7fe2d87ff799)

### GET /lists/:id/games

Retorna todos os jogos de uma lista

![Image](https://github.com/user-attachments/assets/f1ea39e3-340d-4e20-b6cf-be54b399fe81)

### GET /games

Retorna todos os games, independentemente da lista

![Image](https://github.com/user-attachments/assets/609317a5-cace-47a4-bd1e-b1d9b8f1739c)

### GET /games/:id

Retorna um único game

![Image](https://github.com/user-attachments/assets/6a78b385-aa1e-42d8-8972-08dcdfcdf5bf)

### POST /lists/:id/replacement

Muda a posição de um game na lista

![Image](https://github.com/user-attachments/assets/a1e857ee-8697-4bbf-a0fc-2097340fc7c7)

## Modelo conceitual

![Image](https://github.com/user-attachments/assets/af80e59e-33ce-448f-b381-2c36bcbd5bb5)

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- Postgres
- Docker

## URL Base da API

https://dslist-q3yk.onrender.com/
