package br.com.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carrega a árvore de componentes visuais do ficheiro FXML
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/br/com/calculadora/fxml/calculadora.fxml")));

            // Configura a cena com dimensões fixas ideais para o layout da grade
            Scene scene = new Scene(root, 300, 420);

            primaryStage.setTitle("Calculadora JavaFX V2.0");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false); // Impede o redimensionamento para manter o layout alinhado
            primaryStage.show();

        } catch (Exception e) {
            System.err.println("Falha ao iniciar a interface gráfica: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Dispara a infraestrutura do JavaFX
        launch(args);
    }
}
