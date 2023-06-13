package sp.senac.br.olamundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TesteController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textoMensagem;

    public void abrirTelaHello() throws IOException {
        /*var fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        //Comentário aleatorio para commit

        //Ler valor do textField
        welcomeText.setText(textoMensagem.getText());
    }
}