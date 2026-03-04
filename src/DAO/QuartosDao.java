package DAO;

import java.sql.*;
import java.util.ArrayList;
import model.Quartos;
import model.Quartos.Status;


public class QuartosDao {

    private Connection conexao;

    public QuartosDao() {
        this.conexao = new conexaoDAO().getConnection();
    }

    public void adicionar(Quartos q) throws SQLException {
        String sql = "INSERT INTO Quartos (numero, tipo, status, valor_diaria) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, q.getNumero());
            stmt.setString(2, q.getTipo());
            stmt.setString(3, q.getStatus().getValor());
            stmt.setBigDecimal(4, q.getValor_diaria());
            stmt.executeUpdate();
        }
    }

    public ArrayList<Quartos> listar() throws SQLException {
        ArrayList<Quartos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Quartos";
        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Quartos q = new Quartos();
                q.setId(rs.getInt("id"));
                q.setNumero(rs.getInt("numero"));
                q.setTipo(rs.getString("tipo"));
                q.setStatus(Status.fromString(rs.getString("status")));
                q.setValor_diaria(rs.getBigDecimal("valor_diaria"));
                lista.add(q);
            }
        }
        return lista;
    }

    public Quartos buscarPorId(int idQuarto) throws SQLException {
        Quartos q = null;
        String sql = "SELECT * FROM Quartos WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idQuarto);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    q = new Quartos();
                    q.setId(rs.getInt("id"));
                    q.setNumero(rs.getInt("numero"));
                    q.setTipo(rs.getString("tipo"));
                    q.setStatus(Status.fromString(rs.getString("status")));
                    q.setValor_diaria(rs.getBigDecimal("valor_diaria"));
                }
            }
        }
        return q;
    }

    public ArrayList<Quartos> buscarPorStatus(Status status) throws SQLException {
        ArrayList<Quartos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Quartos WHERE status = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, status.getValor());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Quartos q = new Quartos();
                    q.setId(rs.getInt("id"));
                    q.setNumero(rs.getInt("numero"));
                    q.setTipo(rs.getString("tipo"));
                    q.setStatus(Status.fromString(rs.getString("status")));
                    q.setValor_diaria(rs.getBigDecimal("valor_diaria"));
                    lista.add(q);
                }
            }
        }
        return lista;
    }
//para atualizações futuras:
    
    /*public ArrayList<Quartos> buscarPorTipo(String tipo) throws SQLException {
        ArrayList<Quartos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Quartos WHERE tipo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, tipo);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Quartos q = new Quartos();
                    q.setId(rs.getInt("id"));
                    q.setNumero(rs.getInt("numero"));
                    q.setTipo(rs.getString("tipo"));
                    q.setStatus(Status.fromString(rs.getString("status")));
                    q.setValor_diaria(rs.getBigDecimal("valor_diaria"));
                    lista.add(q);
                }
            }
        }
        return lista;
    }*/

    public void atualizar(Quartos q) throws SQLException {
        String sql = "UPDATE Quartos SET numero=?, tipo=?, status=?, valor_diaria=? WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, q.getNumero());
            stmt.setString(2, q.getTipo());
            stmt.setString(3, q.getStatus().getValor());
            stmt.setBigDecimal(4, q.getValor_diaria());
            stmt.setInt(5, q.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Quartos WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}