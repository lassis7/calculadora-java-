package br.com.calculadora.domain;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            // Lançamos a exceção aqui para que a camada de UI decida como mostrar o erro ao usuário
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
