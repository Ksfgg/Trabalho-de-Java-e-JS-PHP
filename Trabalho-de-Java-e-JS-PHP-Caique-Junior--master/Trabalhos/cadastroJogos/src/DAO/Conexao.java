package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    
   
  private static final String DRIVER="com.mysql.jdbc.Driver";  
  private static final String URL ="jdbc:mysql://localhost:3306/jogos";
  private static final String USER = "root";
  private static final String PASS= "";
  
  public static Connection getConnection(){
  try {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER,PASS);
  }catch (ClassNotFoundException | SQLException e){
      throw new RuntimeException("Error",e);
  }
   }  
  public static void fecharConexao(Connection con){
      
      try {
          if(con!= null){
          con.close();
      }
      } catch (SQLException ex) {
         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
      }
   
  
  }
   
      
}
