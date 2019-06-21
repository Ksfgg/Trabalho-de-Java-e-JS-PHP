/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;


public class Main {
 public static void main(String[] args) {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista = dao.pesquisarAll();
        
        for(Funcionario l : lista){
            System.out.println("Nome do jogo:" + l.getNDJ());
        }    
}
}