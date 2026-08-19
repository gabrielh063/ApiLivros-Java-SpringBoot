# 📚 API de Livros — Java + Spring Boot + AWS S3

Projeto desenvolvido durante meus estudos de **Java e Spring Boot**, baseado em um curso da **Fernanda Kipper**.

O objetivo do projeto é trabalhar com uma aplicação Spring Boot capaz de consumir dados de livros em formato JSON, utilizando integração com serviços da **AWS**, especialmente o **Amazon S3**, e disponibilizar essas informações através de uma API REST.

## 🚀 Objetivo do projeto

Este projeto foi desenvolvido com foco no aprendizado de:

- Desenvolvimento de APIs REST com Spring Boot;
- Organização de uma aplicação utilizando camadas;
- Consumo de dados em formato JSON;
- Integração com serviços da AWS;
- Utilização do Amazon S3;
- Comunicação HTTP utilizando Feign;
- Criação de serviços e controllers;
- Manipulação de objetos Java.

## 🛠️ Tecnologias utilizadas

- **Java**
- **Spring Boot**
- **Maven**
- **AWS S3**
- **OpenFeign**
- **JSON**
- **REST API**
- **POSTMAN**

## 📂 Estrutura do projeto

```text
src/
└── main/
    ├── java/
    │   └── com.example.api_exemplo/
    │       ├── controllers/
    │       │   └── BookController.java
    │       │
    │       ├── domain/
    │       │   ├── Book.java
    │       │   └── BookResponse.java
    │       │
    │       ├── feign/
    │       │   └── BookClient.java
    │       │
    │       ├── services/
    │       │   └── BookService.java
    │       │
    │       └── ApiExemploApplication.java
    │
    └── resources/
        ├── static/
        │   └── books.json
        ├── templates/
        └── application.properties
