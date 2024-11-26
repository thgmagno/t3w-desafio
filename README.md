# T3W - Desafio Técnico

Este desafio técnico tem como objetivo avaliar suas habilidades de programação e solução de problemas.

---

### Como criar o repositório

1. Faça o **fork** do repositório.
2. Torne o repositório **privado**.
3. Adicione os seguintes usuários ao repositório:
    - [JefersonSantos06](https://github.com/JefersonSantos06)
    - [fincatto](https://github.com/fincatto)

---

## Tarefas

1. **Alterar script de criação de banco de dados**:
    - Incluir tabelas de `pedido` e `pedido_item` de acordo com as respectivas entidades.
2. **Alterar script de carga de dados**:
    - Incluir dados de pedidos.
3. **Resolver os `TODOs` existentes no código**:
    - Garanta que todas as tarefas marcadas com `TODO` no código sejam resolvidas.
4. **Verificar as funcionalidades da interface**:
    - Certifique-se de que todas as funcionalidades básicas estão funcionando corretamente (Adicionar, Atualizar e Excluir itens).
5. **Extra**:
    - Realize quaisquer mudanças que você considerar pertinentes para o funcionamento adequado da aplicação.
    - Dica de extra: implementar filtros nos grids

### Requisitos

- **Java 21**

## Como Executar

O projeto é um projeto Maven padrão. Para executá-lo na linha de comando, siga os passos abaixo:

1. Na linha de comando, digite `mvnw` (para Windows) ou `./mvnw` (para Mac e Linux).
2. Abra [http://localhost:8080](http://localhost:8080) no seu navegador.

### Importar para sua IDE

Você também pode importar o projeto para a IDE de sua escolha como faria com qualquer projeto Maven. Para mais informações, consulte a [documentação de importação de projetos Vaadin](https://vaadin.com/docs/latest/guide/step-by-step/importing) (Eclipse, IntelliJ IDEA, NetBeans e VS Code).

### Scripts

- **Script para criação de tabelas**: `schema.sql`
- **Script para carga de dados**: `data.sql`

### Acesso ao Console do Banco de Dados

- **URL**: [http://localhost:8080/h2](http://localhost:8080/h2)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Nome do usuário**: `sa`
- **Senha**: (vazia por padrão)

## Links Úteis

- Documentação do framework utilizado: [vaadin.com/docs](https://vaadin.com/docs)
- Pesquisa de componentes de UI e exemplos de uso: [vaadin.com/docs/latest/components](https://vaadin.com/docs/latest/components)
- Conjunto de [classes de utilitários CSS](https://vaadin.com/docs/styling/lumo/utility-classes) do Vaadin para criar UI sem CSS personalizado.

---
