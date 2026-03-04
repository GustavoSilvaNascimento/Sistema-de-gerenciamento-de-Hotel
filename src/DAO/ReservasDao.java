package DAO;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Reservas;

public class ReservasDao {
    Connection conexao = new conexaoDAO().getConnection();

    public void adicionar(Reservas r) throws SQLException {
        String sql = "INSERT INTO Reservas (id_quarto, id_cliente, data_checkin, data_checkout, valor_total, status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, r.getId_quarto());
        stmt.setInt(2, r.getId_cliente());
        stmt.setDate(3, new java.sql.Date(r.getData_checkin().getTime()));
        stmt.setDate(4, new java.sql.Date(r.getData_checkout().getTime()));
        stmt.setBigDecimal(5, r.getValor_total());
        stmt.setString(6, r.getStatus().name());  // status como String
        stmt.execute();
        stmt.close();
    }

    public List<Reservas> listar() throws SQLException {
        List<Reservas> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reservas r = criarReservaDeResultSet(rs);
            lista.add(r);
        }
        rs.close();
        stmt.close();
        return lista;
    }

    public void atualizar(Reservas r) throws SQLException {
        String sql = "UPDATE Reservas SET id_quarto=?, id_cliente=?, data_checkin=?, data_checkout=?, valor_total=?, status=? WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, r.getId_quarto());
        stmt.setInt(2, r.getId_cliente());
        stmt.setDate(3, new java.sql.Date(r.getData_checkin().getTime()));
        stmt.setDate(4, new java.sql.Date(r.getData_checkout().getTime()));
        stmt.setBigDecimal(5, r.getValor_total());
        stmt.setString(6, r.getStatus().name());  // status como String
        stmt.setInt(7, r.getId());
        stmt.executeUpdate();
        stmt.close();
    }

    public ArrayList<Reservas> listarPorCliente(int idCliente) throws SQLException {
        ArrayList<Reservas> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE id_cliente = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idCliente);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reservas r = criarReservaDeResultSet(rs);
            lista.add(r);
        }
        rs.close();
        stmt.close();
        return lista;
    }

    public ArrayList<Reservas> listarPorQuarto(int idQuarto) throws SQLException {
        ArrayList<Reservas> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE id_quarto = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idQuarto);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reservas r = criarReservaDeResultSet(rs);
            lista.add(r);
        }
        rs.close();
        stmt.close();
        return lista;
    }

    public ArrayList<Reservas> listarPorStatus(Reservas.StatusReserva status) throws SQLException {
        ArrayList<Reservas> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE status = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, status.name());
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reservas r = criarReservaDeResultSet(rs);
            lista.add(r);
        }
        rs.close();
        stmt.close();
        return lista;
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Reservas WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public Reservas listarPorId(int id) throws SQLException {
        Reservas r = null;
        String sql = "SELECT * FROM Reservas WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            r = criarReservaDeResultSet(rs);
        }
        rs.close();
        stmt.close();
        return r;
    }

    // reaproveitando codigo (futuramente sera feito ns outros Dao )
    private Reservas criarReservaDeResultSet(ResultSet rs) throws SQLException {
        Reservas r = new Reservas();
        r.setId(rs.getInt("id"));
        r.setId_quarto(rs.getInt("id_quarto"));
        r.setId_cliente(rs.getInt("id_cliente"));
        r.setData_checkin(rs.getDate("data_checkin"));
        r.setData_checkout(rs.getDate("data_checkout"));
        r.setValor_total(rs.getBigDecimal("valor_total"));
        r.setStatus(Reservas.StatusReserva.valueOf(rs.getString("status")));
        return r;
    }
}