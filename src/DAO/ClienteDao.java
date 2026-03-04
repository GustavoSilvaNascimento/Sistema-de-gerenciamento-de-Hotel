package DAO;

import java.sql.*;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDao {
    //criando uma instancia do dao para acessar o banco de dados
    Connection conexao = new conexaoDAO().getConnection();
    //Criando os metodos CRUD
    // CREATE
    public void adicionar(Cliente cliente) throws SQLException{
            String sql = "INSERT INTO Cliente (nome, email, cpf, telefone) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, cliente.getNome());
                    stmt.setString(2, cliente.getEmail());
                    stmt.setString(3, cliente.getCpf());
                    stmt.setString(4, cliente.getTelefone());
                    stmt.executeUpdate();
                    stmt.close();
    }
    //READ
    public ArrayList<Cliente> listar() throws SQLException {
            ArrayList<Cliente> lista = new ArrayList<>();
            String sql = "SELECT * FROM Cliente";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Cliente c1 = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("cpf"),
                    rs.getString("telefone")
                    );
                lista.add(c1);
            }
            rs.close();
            stmt.close();
            return lista;
    }
    //READ-Buscando no banco um cliente pelo id
    public Cliente buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM Cliente WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Cliente cliente = null;
        if (rs.next()) {
            cliente = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("cpf"),
                rs.getString("telefone")
            );
        }
        rs.close();
        stmt.close();
        return cliente; 
    }
    //UPDATE
    public void atualizar(Cliente cliente) throws SQLException {
            String sql = "UPDATE Cliente SET nome=?, email=?, cpf=?, telefone=? WHERE id=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setInt(5, cliente.getId());
            stmt.executeUpdate();
            stmt.close();
    }
    //DELETE
    public void deletar(int id) throws SQLException {
            String sql = "DELETE FROM Cliente WHERE id=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
    }
    
}
