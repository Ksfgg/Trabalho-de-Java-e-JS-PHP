package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;
import java.util.List;
import java.util.ArrayList;


public class FuncionarioDAO {
    Connection con = Conexao.getConnection();
     public List<Funcionario> pesquisarAll(){
        List<Funcionario> lista = new ArrayList<>();
     try{
         PreparedStatement ps = con.prepareStatement("SELECT * FROM funcionario ");
         ResultSet rs = ps.executeQuery();
         while (rs.next()){
             Funcionario funcionario= new Funcionario();
             funcionario.setNDJ(rs.getString("Nome do jogo"));
             funcionario.setNDE(rs.getString("Nome da empresa"));
             funcionario.setGenero(rs.getString("Gênero"));
             funcionario.setTipo(rs.getString("Tipo"));
             funcionario.setPlataforma(rs.getString("Plataforma"));
             lista.add(funcionario);
         }
      }catch(SQLException e){
         System.out.println("Deu erro");
      }
     return null;
     }
     
    public void salvar (Funcionario f){
        
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
            
    }
    }
    public boolean deletar(String NDJ){
        try{
            String sql ="DELETE FROM funcionario WHERE NJD = '"+NDJ+"'";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.execute();
            return true;
        }catch(SQLException e){
        return false;
        }
        }
    public static void fecharConexao(Connection con){
         try {
            con.close();
            System.out.println("Conexao fechada");
        } catch (SQLException e) {
             
        }
    }
}
