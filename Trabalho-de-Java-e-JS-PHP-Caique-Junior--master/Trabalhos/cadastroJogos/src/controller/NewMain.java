
package controller;
import DAO.FuncionarioDAO;
import model.Funcionario;

public class NewMain {

    
    public static void main(String[] args) {
        Funcionario ab = new Funcionario();
       FuncionarioDAO a = new FuncionarioDAO();
       a.salvar(ab);
    }
    
}
