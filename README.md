# 🧮 Calculadora em Java (JavaFX - MVC)

Uma aplicação de calculadora construída em Java com interface gráfica utilizando **JavaFX**. O projeto foi desenvolvido com forte foco em boas práticas de engenharia de software, separando rigorosamente a lógica de negócio da interface através do padrão arquitetural **MVC (Model-View-Controller)**.

*(Cole aqui o link da imagem da sua calculadora funcionando)*

## ✨ Funcionalidades
- **Operações Básicas:** Adição, Subtração, Multiplicação e Divisão.
- **Tratamento de Exceções Resiliente:** Proteção nativa contra divisões por zero (`ArithmeticException`) e entradas inválidas. O sistema exibe a mensagem "Erro" no visor em vez de quebrar a aplicação.
- **Interface Moderna:** UI estruturada via FXML e estilizada com cores sólidas, com botões bem dimensionados e visor limpo.
- **Testes Unitários:** Regras de negócio validadas automaticamente.

## 🧱 Arquitetura e Estrutura
O projeto prova a eficácia de uma arquitetura limpa e desacoplada: a interface gráfica foi completamente reescrita (de Console para JavaFX) sem que uma única linha de código da lógica matemática precisasse ser alterada.

- `domain/` (Model): A classe `Calculadora.java` contém a matemática pura. Totalmente testável e cega em relação a frameworks visuais.
- `ui/` (Controller): O `CalculadoraController.java` atua como ponte. Intercepta os eventos de clique, chama o Model e atualiza a View.
- `resources/.../calculadora.fxml` (View): O layout visual declarado e separado do código Java.

## 🛠️ Tecnologias Utilizadas
- **Java 26**
- **JavaFX 26** (Controls & FXML)
- **JUnit 5** (Testes de Integração e Unidade)
- **Maven** / **Git**

## 🚀 Como Executar

1. Clone este repositório:
```bash
git clone [https://github.com/lassis7/calculadora-java-.git](https://github.com/lassis7/calculadora-java-.git)