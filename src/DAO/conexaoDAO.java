package DAO;
import java.sql.*;
import javax.swing.JOptionPane;



public class conexaoDAO {
        public Connection getConnection(){
                  Connection conexao = null;
                  try {
                          
                        String serverName = "localhost";    

                        String mydatabase ="hotel";    

                        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

                        String username = "root";        

                        String password = "190412";      

                        conexao= DriverManager.getConnection(url, username, password);
                  } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, "conexaoDAO"+erro.getMessage());
                  
                  }
                  return conexao;
        }
}
