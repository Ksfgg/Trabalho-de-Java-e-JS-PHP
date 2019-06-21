
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Caique
 */
public class CadastroJogos extends Application {
    static Stage palco;
    
    public static Scene sceneCad;
    public static Scene sceneVisu;
    public static Scene scener;
    @Override
    public void start(Stage stage) throws IOException {
        palco = stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        //Parent visu=FXMLLoader.load(getClass().getResource("FXMLVisualizar.fxml"));
        Parent cad= FXMLLoader.load(getClass().getResource("FXMLCadastrar.fxml"));
        
        
        scener = new Scene (root,300,250);
        sceneCad= new Scene(cad,300,250);
        //sceneVisu=new Scene(visu,300,250);
        
       
        stage.setTitle("Tela Princinpal");
        stage.setScene(scener);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    public static void cadastroJogo(){
    palco.setTitle("Cadastrar seu jogo");
    palco.setScene(sceneCad);
    }
    public static void visuJogo(){
    palco.setTitle("Jogos dísponiveis");
    palco.setScene(sceneVisu);
    }
    public static void telaPrinci(){
    palco.setTitle("Tela Principal");
    palco.setScene(scener);
    }
    
}
