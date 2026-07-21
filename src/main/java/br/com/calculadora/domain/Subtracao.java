package br.com.calculadora.domain;

public class Subtracao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
