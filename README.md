# DSList

## Detalhes do projeto

DSList é uma aplicação back-end realizado na imersão Java Spring, evento organizado pela DevSuperior.

A aplicação consiste em uma API Rest, onde é possível realizar consultas sobre listas de games do usuário, além de alterar as posições dos jogos de uma determinada lista.

## Endpoints

### GET /lists

Retorna todas as listas

### GET /lists/:id/games

Retorna todos os jogos de uma lista

### GET /games

Retorna todos os games, independentemente da lista

### GET /games/:id

Retorna um único game

### POST /lists/:id/replacement

Muda a posição de um game na lista

corpo: { sourceIndex: int, destinationIndex: int }

## Modelo conceitual

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- Postgres
- Docker

## URL Base da API

https://dslist-q3yk.onrender.com/
