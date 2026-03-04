package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Pagamento;

public class PagamentoDao {
    //criando uma instancia do dao para acessar o banco de dados
    Connection conexao = new conexaoDAO().getConnection();
    //Criando os metodos CRUD
    // CREATE
    public void adicionar(Pagamento pagamento) throws SQLException {
        String sql = "INSERT INTO Pagamentos (id_reserva, valor, data_pagamento, metodo) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, pagamento.getIdReserva());
        stmt.setBigDecimal(2, pagamento.getValor());
        stmt.setDate(3, pagamento.getDataPagamento());
        stmt.setString(4, pagamento.getMetodo().getDescricao()); // Enum → String
        stmt.executeUpdate();
        stmt.close();
    }
    //READ
    public ArrayList<Pagamento> listar() throws SQLException {
        ArrayList<Pagamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM Pagamentos";
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Pagamento f1 = new Pagamento();
            f1.setId(rs.getInt("id"));
            f1.setIdReserva(rs.getInt("id_reserva"));
            f1.setValor(rs.getBigDecimal("valor"));
            f1.setDataPagamento(rs.getDate("data_pagamento"));
            f1.setMetodo(Pagamento.MetodoPagamento.fromString(rs.getString("metodo"))); // String → Enum
            lista.add(f1);
        }
        rs.close();
        stmt.close();
        return lista;
    }
    //UPDATE
    public void atualizar(Pagamento pagamento) throws SQLException {
        String sql = "UPDATE Pagamentos SET id_reserva=?, valor=?, data_pagamento=?, metodo=? WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, pagamento.getIdReserva());
        stmt.setBigDecimal(2, pagamento.getValor());
        stmt.setDate(3, pagamento.getDataPagamento());
        stmt.setString(4, pagamento.getMetodo().getDescricao());
        stmt.setInt(5, pagamento.getId());
        stmt.executeUpdate();
        stmt.close();
    }
    //DELETE(nao utilizado)
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM Pagamentos WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
}