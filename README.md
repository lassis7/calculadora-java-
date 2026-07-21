# 🧮 Calculadora em Java (V3.0 - Design Patterns & JavaFX)

Uma aplicação de calculadora de nível corporativo desenvolvida em Java, combinando uma interface gráfica moderna em **JavaFX** com uma arquitetura de software altamente escalável baseada em **Design Patterns** e princípios **SOLID**.

<img width="366" height="550" alt="Captura de tela 2026-07-14 114533" src="https://github.com/user-attachments/assets/40f37f67-8784-4335-b6e9-d8d4be97a8b9" />


## ✨ Evolução e Versões do Projeto
- **V1.0 (Console):** Foco em lógica pura, arquitetura desacoplada e resiliência no tratamento de exceções via terminal.
- **V2.0 (JavaFX / MVC):** Migração para interface gráfica desacoplada utilizando o padrão arquitetural MVC.
- **V3.0 (Design Patterns):** Refatoração completa do núcleo de negócio aplicando o padrão **Strategy** para garantir extensibilidade e conformidade com o Open/Closed Principle (OCP).

## 🏛️ Arquitetura & Padrões de Projeto (V3.0)
A grande inovação desta versão reside na camada de domínio (`domain`), na qual a complexidade de múltiplos `switch-cases` foi eliminada através do **Strategy Design Pattern**:
- **`OperacaoMatematica` (Interface):** Define o contrato unificado que todas as operações devem seguir.
- **Classes Concretas (`Soma`, `Subtracao`, `Multiplicacao`, `Divisao`):** Cada operação encapsula a sua própria lógica de cálculo de forma isolada.
- **Polimorfismo:** A classe `Calculadora` utiliza um mapa (`Map`) para gerenciar e executar as estratégias dinamicamente, permitindo adicionar novas operações matemáticas sem alterar nenhuma linha do código existente.

## 🧱 Estrutura de Pacotes
- `domain/`: Regras de negócio puras, contratos de interfaces e classes estratégicas de cálculo.
- `ui/`: Controlador JavaFX (`CalculadoraController`).
- `resources/`: Arquivo visual FXML.

## 🛠️ Tecnologias Utilizadas
- **Java 28**
- **JavaFX 17** (Controls & FXML)
- **JUnit 5** (Testes unitários)
- **Maven & Git**

## 🚀 Como Executar

1. Clone este repositório:
```bash
git clone [https://github.com/lassis7/calculadora-java.git](https://github.com/lassis7/calculadora-java.git)
