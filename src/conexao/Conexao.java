package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author senai
 */
public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/quiz";
    private static final String usuario = "root";
    private static final String senha = "1";
  
  public static Connection conectar() throws SQLException {
      return (Connection) DriverManager.getConnection(url, usuario, senha);
  
  
  }
    
}
