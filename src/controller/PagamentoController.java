package controller;

import DAO.ClienteDao;
import DAO.PagamentoDao;
import DAO.QuartosDao;
import DAO.ReservasDao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Pagamento;
import model.Quartos;
import model.Reservas;



public class PagamentoController {
    private ReservasDao reserv = new ReservasDao();
    private ClienteDao cliente = new ClienteDao();
    private QuartosDao quart = new QuartosDao();
    private PagamentoDao pag=new PagamentoDao();
    
    public Cliente listarCliente(int IdCliente) throws SQLException {
        return cliente.buscarPorId(IdCliente);
    }
    public Reservas listarReserva(int idQuarto) throws SQLException {
        return reserv.listarPorQuarto(idQuarto).getFirst();
    }
    public Quartos listarQuarto(int idQuarto) throws SQLException {
        return quart.buscarPorId(idQuarto);
    }
    public void adicionarPagamento(Pagamento p) throws SQLException{
        pag.adicionar(p);
    }
    public void adicionarReserva(Reservas r) throws SQLException{
        reserv.adicionar(r);
    }
    public Reservas listarPorId(int id) throws SQLException{
        
            return reserv.listarPorId(id);
        
    }
}
