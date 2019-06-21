
package controller;

import DAO.FuncionarioDAO;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Funcionario;
import view.CadastroJogos;



public class FXMLCadastrarController{



    @FXML
    private TextField txtNDE;

    @FXML
    private TextField txtG;

    @FXML
    private TextField txtP;

    @FXML
    private TextField txtT;

    @FXML
    private TextField txtNDJ;

    @FXML
    void salvar() {
            Funcionario f = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
            f.setNDJ(txtNDJ.getText());
            f.setNDE(txtNDE.getText());
            f.setGenero(txtG.getText());
            f.setTipo(txtT.getText());
            f.setPlataforma(txtP.getText());
            dao.salvar(f);
           
            CadastroJogos.telaPrinci();
            
    }
    public void limpaCampos(){
    txtNDJ.setText("");
    txtNDE.setText("");
    txtG.setText("");
    txtT.setText("");
    txtP.setText("");
    }
    
    
}
