
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
     public static Connection getConexao(){ //instanciar uma classe con
        Connection conn = null;
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc ", "root", "");
            System.out.println("Conectado");
        }catch(SQLException e){
            System.err.println("Não conectado");
        }
        return conn;
    }
        
    public static void main(String[] args) {
        Conexao.getConexao();       
        
    }   
    
    
}
