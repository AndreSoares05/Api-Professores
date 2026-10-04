# API de Professores

## Identificação

- **Aluno:** [Marcos Andre dos Santos Soares]
- **Descrição:** API REST para cadastro e gerenciamento de professores, com CRUD completo e filtros por nome e área, desenvolvida com Spring Boot, Spring Data JPA e PostgreSQL.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Como executar

1. Clone o projeto:

```bash
git clone https://github.com/AndreSoares05/Api-Professores.git
```

2. No PostgreSQL, crie o banco `professores_db` e execute:

```sql
CREATE TABLE professor (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150),
    area VARCHAR(100),

    telefone VARCHAR(20)
);

INSERT INTO professor (nome, email, area, telefone) VALUES
('João da Silva', 'joao@email.com', 'Desenvolvimento', '86999990001'),
('Maria Joana', 'mariajoana@email.com', 'Banco de Dados', '86999990002'),
('João Pedro', 'joaopedro@email.com', 'Desenvolvimento', '86999990003');
```

3. Em `src/main/resources/application.properties`, troque `SUA_SENHA` pela senha do seu PostgreSQL.
4. Execute a classe `ProfessoresApplication` (botão **Run** no VS Code).
5. A API ficará disponível em `http://localhost:8080`.

## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /professores | Lista todos |
| GET | /professores/nome/{nome} | Filtra por nome |
| GET | /professores/area/{area} | Filtra por área |
| POST | /professores | Cadastra professor |
| PUT | /professores/{id} | Edita professor |
| DELETE | /professores/{id} | Exclui professor |

## Evidências de execução

### Caso 1 — Listar professores

`GET /professores`

[<img width="1017" height="487" alt="listar png" src="https://github.com/user-attachments/assets/89815d9c-ae17-4d0b-b75e-c646cfd6fa4e" />
]


### Caso 2 — Filtrar por nome

`GET /professores/nome/{nome}`

[<img width="1018" height="473" alt="nome png" src="https://github.com/user-attachments/assets/916fc956-18d2-4264-8c86-6630a127e838" />
]

### Caso 3 — Filtrar por área

`GET /professores/area/{area}`

[<img width="1012" height="480" alt="area png" src="https://github.com/user-attachments/assets/d81ef2da-07d2-4953-aea2-3aaeabed95f7" />
]

### Caso 4 — Cadastrar professor

`POST /professores` com o JSON enviado e a resposta da API.

[<img width="1020" height="291" alt="cadastrar png" src="https://github.com/user-attachments/assets/9d93f2a6-2b8c-4f33-9f39-aac69f920635" />
]

### Caso 5 — Editar professor

`PUT /professores/{id}` com o resultado da alteração.

[<img width="1014" height="263" alt="editar png" src="https://github.com/user-attachments/assets/bffa5677-a507-4860-954c-dae42516f849" />
]

### Caso 6 — Excluir professor

`DELETE /professores/{id}` 

[<img width="1021" height="192" alt="excluir png" src="https://github.com/user-attachments/assets/2f2de22d-f0e5-46e1-9d93-2aec4c372d69" />
]
