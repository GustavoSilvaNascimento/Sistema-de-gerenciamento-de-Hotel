
package controller;

import DAO.ClienteDao;
import DAO.QuartosDao;
import DAO.ReservasDao;
import DAO.conexaoDAO;
import java.sql.*;
import java.util.ArrayList;
import model.Cliente;
import model.Quartos;
import model.Quartos.Status;
import model.Reservas;

public class CheckinController {

   

    private Connection conexao = new conexaoDAO().getConnection();
    private ReservasDao reserv = new ReservasDao();
    private ClienteDao cliente = new ClienteDao();
    private QuartosDao quart = new QuartosDao();

   

    public CheckinController() {
    }


    public ArrayList<Reservas> listarReserva(int idCliente) throws SQLException {
        return reserv.listarPorCliente(idCliente);
    }
    public Reservas listarPorId(int id) throws SQLException{
            return reserv.listarPorId(id);
    }
    public void excluirPorId(int id) throws SQLException{
        reserv.excluir(id);
    }
    public Quartos listarQuarto(int idQuarto) throws SQLException {
        return quart.buscarPorId(idQuarto);
    }

    public ArrayList<Quartos> listarQuarto() throws SQLException {
        return quart.listar();
    }

    public ArrayList<Cliente> listarCliente() throws SQLException {
        return cliente.listar();
    }

  

    public void atualizarReserva(Reservas r) throws SQLException {
        reserv.atualizar(r);
    }

    public void atualizarQuarto(Quartos q) throws SQLException {
        quart.atualizar(q);
    }
    public void atualizarCliente(Cliente c) throws SQLException{
        cliente.atualizar(c);
    }

    public void adicionarReserva(Reservas r) throws SQLException {
        reserv.adicionar(r);
    }
    public ArrayList<Quartos> listarQuartosPorStatus(Status status) throws SQLException {
        return (ArrayList<Quartos>) quart.buscarPorStatus(status);
    }
    public ArrayList<Reservas>listarPorQuarto(int idQuarto) throws SQLException {
        return (ArrayList<Reservas>) reserv.listarPorQuarto(idQuarto);
    }
    
    public ArrayList<Reservas> listarReservaPorStatus(Status status) throws SQLException {
        ArrayList<Reservas> reStats = new ArrayList<>();

        ArrayList<Quartos> quartosComStatus = listarQuartosPorStatus(status);

        for (Quartos quarto : quartosComStatus) {
            int idQuarto = quarto.getId();
            ArrayList<Reservas> reservasDoQuarto = listarPorQuarto(idQuarto);
            reStats.addAll(reservasDoQuarto);
        }

        return reStats;
    }
    public void excluirCliente(Cliente c) throws SQLException{
        cliente.deletar(c.getId());
    }

    
    
    

}