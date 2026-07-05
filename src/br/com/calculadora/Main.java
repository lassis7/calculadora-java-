package br.com.calculadora;

import br.com.calculadora.ui.MenuConsole;

public class Main {
    public static void main(String[] args) {
        // Instancia a camada de interface de utilizador
        MenuConsole menu = new MenuConsole();

        // Inicia o ciclo de execução da calculadora
        menu.iniciar();
    }
}
