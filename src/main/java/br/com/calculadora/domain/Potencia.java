package br.com.calculadora.domain;

public class Potencia implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}
