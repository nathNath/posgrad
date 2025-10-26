# 📄 Desafio: API de Gerenciamento de Clientes

## 📝 Classes

- **Cliente**: Representa a entidade do cliente.
- **ClienteRepository**: Interface para acesso ao banco de dados.
- **ClienteService**: Contém a lógica de negócios.
- **ClienteController**: Gerencia as requisições HTTP.

## 🔗 Relações

- **ClienteController** depende de **ClienteService**.
- **ClienteService** depende de **ClienteRepository**.
- **ClienteRepository** manipula a entidade **Cliente**.

## 📂 Estrutura de Pastas

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── posgrad/
│   │           └── desafio/
│   │               ├── controller/   # Contém as classes responsáveis por gerenciar as requisições HTTP.
│   │               ├── model/        # Contém as classes que representam as entidades do domínio.
│   │               ├── repository/   # Contém as interfaces para acesso ao banco de dados.
│   │               └── service/      # Contém as classes que implementam a lógica de negócios.
│   └── resources/
│       ├── application.properties    # Arquivo de configuração da aplicação.
│       └── docs/                     # Contém arquivos de documentação, como o diagrama UML.
└── test/                             # Contém os testes automatizados da aplicação.
    └── java/
        └── com/
            └── posgrad/
                └── desafio/
                    ├── controller/   # Testes para as classes do controller.
                    ├── service/      # Testes para as classes do service.
                    └── repository/   # Testes para as classes do repository.
```

## 📊 Diagrama UML

O diagrama UML que representa as classes e suas relações está disponível no arquivo `docs.puml`.