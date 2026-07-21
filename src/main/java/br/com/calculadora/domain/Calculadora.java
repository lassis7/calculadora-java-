package br.com.calculadora.domain;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    // O mapa atua como uma "fábrica" de estratégias
    private final Map<String, OperacaoMatematica> operacoes = new HashMap<>();

    public Calculadora() {
        // Registramos as operações disponíveis no momento da criação da calculadora
        operacoes.put("+", new Soma());
        operacoes.put("-", new Subtracao());
        operacoes.put("*", new Multiplicacao());
        operacoes.put("/", new Divisao());
        operacoes.put("^", new Potencia());
    }

    public double executarOperacao(String operador, double a, double b) {
        // Buscamos a estratégia correta baseada no símbolo (+, -, *, /)
        OperacaoMatematica operacao = operacoes.get(operador);

        if (operacao == null) {
            throw new IllegalArgumentException("Operação não suportada: " + operador);
        }

        // Executamos o cálculo sem precisar de nenhum IF ou SWITCH
        return operacao.calcular(a, b);
    }
}