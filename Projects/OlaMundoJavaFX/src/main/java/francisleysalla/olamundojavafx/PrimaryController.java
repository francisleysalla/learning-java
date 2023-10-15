package francisleysalla.olamundojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
    /**
     *
     * @param event
     */
    public void clicouBotao(ActionEvent event){
        lblMensagem.setText("Hello World!");
    }
}
