package DAO;

import java.sql.*;
import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioDao {
    //criando uma instancia do dao para acessar o banco de dados
    Connection conexao = new conexaoDAO().getConnection();
    //Criando os metodos CRUD
    // CREATE
    public void adicionar(Funcionario funcionario) throws SQLException {
            String sql = "INSERT INTO Funcionarios (nome, cargo, login, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getLogin());
            stmt.setString(4, funcionario.getSenha());
            stmt.executeUpdate();
            stmt.close();
    }
    // READE
    public ArrayList<Funcionario> listar() throws SQLException {
            ArrayList<Funcionario> lista = new ArrayList<>();
            String sql = "SELECT * FROM Funcionarios ";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Funcionario f1 = new Funcionario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cargo"),
                    rs.getString("login"),
                    rs.getString("senha")
                );
                lista.add(f1);
            }
            rs.close();
            stmt.close();
            return lista;
    }
    //UPDATE
    public void atualizar(Funcionario funcionario) throws SQLException {
            String sql = "UPDATE Funcionarios  SET nome=?, cargo=?, login=?, senha=? WHERE id=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getLogin());
            stmt.setString(4, funcionario.getSenha());
            stmt.setInt(5, funcionario.getId());
            stmt.executeUpdate();
            stmt.close();
    }
    //DELETE
    public void deletar(int id) throws SQLException {
            String sql = "DELETE FROM Funcionarios  WHERE id=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
    }
    //READE- Verificando no banco um funcionario que tenha os login e senha digitados
    public boolean autenticar(String login, String senha) throws SQLException {
            String sql = "SELECT * FROM Funcionarios WHERE login = ? AND senha = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            boolean autenticado = rs.next();
            rs.close();
            stmt.close();
    return autenticado;
    }
    public String autenticarCargo(String login, String senha) throws SQLException {
            String cargo=null;
            String sql = "SELECT * FROM Funcionarios WHERE login = ? AND senha = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            boolean autenticado = rs.next();
            if(autenticado==true){
                cargo=rs.getString("cargo");
            }else{}
            rs.close();
            stmt.close();

    return cargo;
    }
}
