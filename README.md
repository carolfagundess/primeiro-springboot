# Primeiro Projeto Spring Boot

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.5-green)

Este é o meu primeiro projeto utilizando **Spring Boot**, um framework Java para criação de aplicações web e microservices. 🚀

## 📌 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL (ou outro banco de dados relacional)
- Maven

## 📂 Estrutura do Projeto

```
primeiro-springboot/
│-- src/
│   ├── main/
│   │   ├── java/com/seuusuario/primeirospringboot/
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── model/         # Modelos de dados
│   │   │   ├── repository/    # Interfaces de repositórios
│   │   │   ├── service/       # Lógica de negócios
│   │   │   ├── PrimeiroSpringbootApplication.java # Classe principal
│   │   ├── resources/
│   │   │   ├── application.properties # Configuração do projeto
│   ├── test/  # Testes unitários
│-- pom.xml  # Arquivo de dependências do Maven
```

## 🚀 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/carolfagundess/primeiro-springboot.git
   ```

2. Entre na pasta do projeto:
   ```bash
   cd primeiro-springboot
   ```

3. Compile e rode a aplicação com o Maven:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a API no navegador ou via Postman:
   ```
   http://localhost:8080
   ```

## 📜 Endpoints Principais

- `GET /api/exemplo` - Retorna uma lista de exemplos.
- `POST /api/exemplo` - Cria um novo exemplo.
- `PUT /api/exemplo/{id}` - Atualiza um exemplo.
- `DELETE /api/exemplo/{id}` - Remove um exemplo.

## 🛠 Configuração do Banco de Dados

No arquivo `application.properties`, configure as credenciais do banco de dados:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/meubanco
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

## 📌 Contribuição

Sinta-se à vontade para contribuir! Faça um **fork** do projeto, crie uma **branch** e envie um **pull request**. 😉

---

Feito com ❤️ por [Carolina Fagundes](https://github.com/carolfagundess) 🚀
