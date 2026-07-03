package br.com.calculadora.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

// Este é um modelo de como capturaremos os erros na camada de UI
public class TratamentoExcecoes {

    public static double lerNumero(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                // Tenta ler o número
                double numero = scanner.nextDouble();
                return numero; // Se der certo, sai do loop e retorna

            } catch (InputMismatchException e) {
                // Captura o erro de digitação (ex: letras em vez de números)
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas números.");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }
        }
    }

    public static void executarDivisaoSegura(Calculadora calc, double a, double b) {
        try {
            double resultado = calc.dividir(a, b);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // Captura o erro disparado pela nossa classe Calculadora na Tarefa 2.1
            System.out.println(e.getMessage());
        }
    }
}
