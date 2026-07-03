package br.com.calculadora.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Instanciamos a calculadora que será testada
    private final Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2.0, 3.0), "A soma de 2 + 3 deve ser 5");
        assertEquals(-1.0, calc.somar(2.0, -3.0), "A soma de 2 + (-3) deve ser -1");
    }

    @Test
    public void testSubtrair() {
        assertEquals(1.5, calc.subtrair(4.5, 3.0), "A subtração de 4.5 - 3 deve ser 1.5");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(10.0, calc.multiplicar(2.0, 5.0), "A multiplicação de 2 * 5 deve ser 10");
        assertEquals(0.0, calc.multiplicar(5.0, 0.0), "Qualquer número multiplicado por 0 deve ser 0");
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calc.dividir(5.0, 2.0), "A divisão de 5 por 2 deve ser 2.5");
    }

    @Test
    public void testDividirPorZero() {
        // Verifica se a exceção ArithmeticException é lançada corretamente
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5.0, 0.0);
        });

        // Verifica se a mensagem de erro é a que definimos na Tarefa 2.1
        assertEquals("Erro: Divisão por zero não é permitida.", exception.getMessage());
    }
}