
package controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import view.CadastroJogos;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class FXMLPrincipalController implements Initializable {


    @FXML void cadastrar() {
     CadastroJogos.cadastroJogo();   
    }

    @FXML void pesquisar() {
            CadastroJogos.visuJogo();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         


}
    }    
    

