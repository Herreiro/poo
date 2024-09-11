# Sistema de Controle de Despesas

Este é um sistema de controle de despesas em Java que permite gerenciar despesas e pagamentos, incluindo funcionalidades para conciliação de despesas. O sistema é composto por uma interface de linha de comando (CLI) para interação com o usuário.

## Funcionalidades

- **Entrar Despesa**: Adicionar uma nova despesa com descrição, valor, data de vencimento e tipo de despesa.
- **Anotar Pagamento**: Registrar um pagamento feito para uma despesa específica.
- **Listar Despesas em Aberto no Período**: Visualizar despesas que estão pendentes dentro de um intervalo de datas.
- **Listar Despesas Pagas no Período**: Visualizar despesas que foram pagas dentro de um intervalo de datas.
- **Gerenciar Tipos de Despesa**: Criar e listar tipos de despesa.
- **Gerenciar Usuários**: Cadastrar e listar usuários com login e senha criptografada.

## Estrutura do Projeto

- **`src/main/Main.java`**: Classe principal que contém o menu e a lógica para interagir com o usuário.
- **`src/controller/DespesaController.java`**: Controlador para gerenciar despesas.
- **`src/controller/TipoDespesaController.java`**: Controlador para gerenciar tipos de despesa.
- **`src/controller/UsuarioController.java`**: Controlador para gerenciar usuários.
- **`src/model/Despesa.java`**: Classe para representar uma despesa.
- **`src/model/TipoDespesa.java`**: Classe para representar um tipo de despesa.
- **`src/model/Usuario.java`**: Classe para representar um usuário.
- **`src/model/Pagavel.java`**: Interface para classes que podem ser pagas.
- **`src/utils/ArquivoUtil.java`**: Utilitário para salvar e carregar dados de arquivos.
- **`src/utils/CriptografiaUtil.java`**: Utilitário para criptografar senhas.

## Pré-requisitos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado. Você também pode usar [Maven](https://maven.apache.org/) ou [Gradle](https://gradle.org/) para gerenciamento de dependências e construção do projeto.

## Configuração e Execução

Para compilar e executar o projeto, siga os seguintes passos:

**Compile o projeto**:

```bash
javac -d bin src/main/Main.java src/controller/DespesaController.java src/controller/TipoDespesaController.java src/controller/UsuarioController.java src/model/Despesa.java src/model/TipoDespesa.java src/model/Usuario.java src/model/Pagavel.java src/utils/ArquivoUtil.java src/utils/CriptografiaUtil.java
