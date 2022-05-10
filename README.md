![image](https://user-images.githubusercontent.com/61791877/167627700-f4e58ec5-88e3-4949-9016-84f1717e548a.png)


# Teste técnico - CI&T

---

### Status
>Concluído ✔️

---

### Tecnologias

* Java 11
* Spring Boot 2.6.7
* Spring Data JPA
* Maven
* MySQL
* H2 Database
* JUnit
* Mockito
* Swagger

---

### Como utilizar a aplicação?

* 1- Clone o projeto para o diretório desejado
* 2- Abra um terminal (git bash, de preferência) na raiz do projeto
* 3- Execute os seguintes comandos:
```
mvn clean install
mvn clean package
docker-compose up -d
```

* 4- Rode a aplicação com o IntelliJ
* 5- Acesse os endpoints da aplicação, via swagger: http://localhost:8080/swagger-ui/#/

---

### Banco de dados com Docker

---

### Features

* **Exceções personalizadas**: O código foi programado para lançar exceções descritivas, que auxiliam o programador a encontrar a origem do problema.

_exemplo de casos alternativos_

* **Lista de exceções referentes à validação**: Ao tentar realizar a entrada de dados incompletos/incorretos, o sistema retorna uma lista de exceções personalizadas.

_exemplo_

* **Testes unitários**: Com o objetivo de manter a integridade das funções, realizei alguns testes nas seguintes camadas: **repository** e **servcice**

_exemplo_