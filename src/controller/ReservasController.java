package controller;

import DAO.ClienteDao;
import DAO.QuartosDao;
import DAO.ReservasDao;
import DAO.conexaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Quartos;
import model.Reservas;


public class ReservasController {
    private final Connection conexao = new conexaoDAO().getConnection();
    private final ReservasDao reserv = new ReservasDao();
    private final ClienteDao cliente = new ClienteDao();
    private final QuartosDao quart = new QuartosDao();
    
    public ArrayList<Cliente> listarCliente() throws SQLException{
        return cliente.listar();
    }
    public ArrayList<Quartos> listarQuartosPorStatus(Quartos.Status status) throws SQLException {
        return (ArrayList<Quartos>) quart.buscarPorStatus(status);
    }
    public Quartos listarQuarto(int idQuarto) throws SQLException {
        return quart.buscarPorId(idQuarto);
    }
    public ArrayList<Reservas> listarReserva(int idCliente) throws SQLException {
        return reserv.listarPorCliente(idCliente);
    }
    public void adicionarReserva(Reservas r) throws SQLException {
        reserv.adicionar(r);
    }
    public void atualizarQuarto(Quartos q) throws SQLException {
        quart.atualizar(q);
    }
    public ArrayList<Reservas> listarPorStatus(Reservas.StatusReserva sr) throws SQLException{
        return reserv.listarPorStatus(sr);
    }
    public Cliente buscarPorId(int idCliente) throws SQLException{
        return cliente.buscarPorId(idCliente);
    }
    public Reservas listarReservaPorId(int idReserva) throws SQLException{
        return reserv.listarPorId(idReserva);
    }
    public void atualizarReserva(Reservas r) throws SQLException{
        reserv.atualizar(r);
    }
    public void excluirReserva(int idReserva) throws SQLException{
        reserv.excluir(idReserva);
    }
}
