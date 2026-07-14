module calculadora.java {
    // Permite que o código use as classes visuais e o FXML
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;

    // Permite que o JavaFX "enxergue" as suas classes (como o seu Controller)
    opens br.com.calculadora.ui to javafx.fxml;
    exports br.com.calculadora;
    exports br.com.calculadora.ui;
}