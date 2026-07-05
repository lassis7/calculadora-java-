# Calculadora Básica em Java (Console MVP)

Uma aplicação de calculadora modular desenvolvida em Java, focada em boas práticas de Programação Orientada a Objetos (POO), arquitetura desacoplada e resiliência no tratamento de exceções.

## 🛠️ Tecnologias e Ferramentas
- **Linguagem:** Java (JDK 17 ou superior)
- **Testes Unitários:** JUnit 5
- **Controlo de Versões:** Git

## 📌 Funcionalidades
- Operações matemáticas básicas: Adição, Subtração, Multiplicação e Divisão.
- Tratamento robusto contra divisões por zero (`ArithmeticException`).
- Proteção contra entradas de dados inválidas (`InputMismatchException`), garantindo que o programa não crasha caso o utilizador digite letras.
- Fluxo contínuo de execução através de menus interativos em loop.

## 🧱 Estrutura do Projeto (Arquitetura)
O projeto foi construído seguindo o princípio de separação de responsabilidades:
- `domain/`: Contém a lógica de negócio pura (matemática), 100% isolada e testável.
- `ui/`: Camada de interface gráfica de texto (Console), responsável pela interação com o utilizador.
- `Main`: Ponto de entrada que liga as camadas e inicia a execução.

## 🧪 Como Executar os Testes
Para correr os testes unitários automatizados com o JUnit: Executar o arquivo CalculadoraTest.