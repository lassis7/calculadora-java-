package br.com.calculadora.ui;

import br.com.calculadora.domain.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private TextField visor;

    private final Calculadora calculadora = new Calculadora();
    private double primeiroNumero = 0;
    private String operacao = "";
    private boolean iniciarNovoNumero = true;

    @FXML
    private void processarNumero(ActionEvent event) {
        // Se uma operação acabou de ser escolhida, limpa o visor para o novo número
        if (iniciarNovoNumero) {
            visor.setText("");
            iniciarNovoNumero = false;
        }

        // Obtém o texto do botão numérico pressionado (0-9)
        String valorBotao = ((Button) event.getSource()).getText();
        visor.setText(visor.getText() + valorBotao);
    }

    @FXML
    private void processarOperacao(ActionEvent event) {
        try {
            String valorBotao = ((Button) event.getSource()).getText();

            if (!visor.getText().isEmpty() && !visor.getText().equals("Erro")) {
                primeiroNumero = Double.parseDouble(visor.getText());
                operacao = valorBotao;
                iniciarNovoNumero = true;
            }
        } catch (NumberFormatException e) {
            visor.setText("Erro");
            iniciarNovoNumero = true;
        }
    }

    @FXML
    private void calcularResultado(ActionEvent event) {
        if (operacao.isEmpty() || visor.getText().isEmpty() || visor.getText().equals("Erro")) {
            return;
        }

        try {
            double segundoNumero = Double.parseDouble(visor.getText());
            double resultado = 0;

            // Onde antes havia um switch-case inteiro, agora fica apenas:
            resultado = calculadora.executarOperacao(operacao, primeiroNumero, segundoNumero);

            // Exibe o resultado formatado no visor
            visor.setText(String.valueOf(resultado));
            operacao = "";
            iniciarNovoNumero = true;

        } catch (ArithmeticException e) {
            // Captura de forma limpa o erro de divisão por zero definido no domínio
            visor.setText("Erro: Divisão por zero");
            iniciarNovoNumero = true;
        } catch (NumberFormatException e) {
            visor.setText("Erro de Formato");
            iniciarNovoNumero = true;
        }
    }

    @FXML
    private void limparVisor(ActionEvent event) {
        visor.setText("");
        primeiroNumero = 0;
        operacao = "";
        iniciarNovoNumero = true;
    }
}
