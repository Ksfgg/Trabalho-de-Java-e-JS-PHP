package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;


public class FuncionarioDAO {
    
    public void salvar (Funcionario f){
        Connection con = Conexao.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO funcionario(NDJ,NDE,G,T,P)VALUES(?,?,?,?,?)");
            ps.setString(1,f.getNDJ());
            ps.setString(2,f.getNDE());
            ps.setString(3,f.getGenero());
            ps.setString(4,f.getTipo());
            ps.setString(5,f.getPlataforma());
            
            ps.executeUpdate();
            System.out.println("Salvo com sucesso!!!!!!!!!!");
        } catch (SQLException ex) {
            System.out.println("Deu pau, arruma aí juvenal"+ex);
        }finally{
            Conexao.fecharConexao(con, ps);
    }
    }
}
