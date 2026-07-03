package br.com.calculadora.ui;

import br.com.calculadora.domain.Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConsole {

    private final Calculadora calculadora;
    private final Scanner scanner;

    public MenuConsole() {
        this.calculadora = new Calculadora();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        System.out.println("=== BEM-VINDO À CALCULADORA JAVA ===");

        while (continuar) {
            exibirOpcoes();
            int opcao = lerOpcao();

            if (opcao == 5) {
                continuar = false;
                System.out.println("\nCalculadora encerrada. Até à próxima!");
                break;
            }

            processarOperacao(opcao);
        }

        scanner.close(); // Fecha o scanner ao encerrar o programa
    }

    private void exibirOpcoes() {
        System.out.println("\nEscolha uma operação:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");
        System.out.println("5. Sair");
        System.out.print("Opção: ");
    }

    private int lerOpcao() {
        while (true) {
            try {
                int opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 5) {
                    return opcao;
                }
                System.out.print("Opção inválida. Escolha um número entre 1 e 5: ");
            } catch (InputMismatchException e) {
                System.out.print("Erro: Digite um número inteiro válido: ");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    private double lerNumero(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas números.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    private void processarOperacao(int opcao) {
        System.out.println(); // Linha em branco para organização visual
        double num1 = lerNumero("Digite o primeiro número: ");
        double num2 = lerNumero("Digite o segundo número: ");
        double resultado = 0;
        boolean operacaoValida = true;

        try {
            switch (opcao) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("---------------------------------");
                System.out.println("Resultado: " + resultado);
                System.out.println("---------------------------------");
            }

        } catch (ArithmeticException e) {
            // Captura a divisão por zero lançada pela classe Calculadora
            System.out.println("---------------------------------");
            System.out.println(e.getMessage());
            System.out.println("---------------------------------");
        }
    }
}
