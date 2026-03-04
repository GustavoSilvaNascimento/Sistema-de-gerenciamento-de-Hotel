package controller;
import DAO.ClienteDao;
import java.sql.SQLException;
import model.Cliente;

public class ClienteController {
    
    public void cadastrarCliente(String nome, String email, String cpf, String telefone) throws SQLException{
            Cliente cl1=new Cliente(nome, email, cpf, telefone);
            ClienteDao cd=new ClienteDao();
            cd.adicionar(cl1);
 
    }
}
