
package controller;

import DAO.FuncionarioDAO;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Funcionario;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class FXMLVisualizarController implements Initializable {

   
    @FXML
    private TableView<Funcionario> tabela;

    @FXML
    private TableColumn<Funcionario,String> colNDJ;

    @FXML
    private TableColumn<Funcionario,String > colNDE;

    @FXML
    private TableColumn<Funcionario,String > colG;

    @FXML
    private TableColumn<Funcionario, String> colT;

    @FXML
    private TableColumn<Funcionario, String> colP;
    
    FuncionarioDAO dao = new FuncionarioDAO();

    @FXML
    void btExcluir(ActionEvent event) {
        
         Funcionario funci= new Funcionario();
         funci =tabela.getSelectionModel().getSelectedItem();
         if(funci!=null){
         FuncionarioDAO dao = new FuncionarioDAO();
         if(dao.deletar(funci.getNDJ())){
         
                mostrarTabela();
         }else{
             System.out.println("Erro ao excluir");
         }}
         }
                 
                 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarTabela();
    }
    

   public void mostrarTabela(){
   colNDJ.setCellValueFactory(new PropertyValueFactory<>("Nome do jogo"));
   colNDE.setCellValueFactory(new PropertyValueFactory<>("Nome da empresa"));
   colG.setCellValueFactory(new PropertyValueFactory<>("Gênero"));
   colT.setCellValueFactory(new PropertyValueFactory<>("Tipo"));
   colP.setCellValueFactory(new PropertyValueFactory<>("Plataforma"));
   tabela.setItems(listaFunci());
   }
   public ObservableList<Funcionario> listaFunci(){
        List<Funcionario> lista =  dao.pesquisarAll();
        return FXCollections.observableArrayList(lista);        
    }

}
