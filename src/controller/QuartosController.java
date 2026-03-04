package controller;

import DAO.QuartosDao;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Quartos;


public class QuartosController {
    QuartosDao qd1=new QuartosDao();
    public void adicionarQuarto(int numero, String tipo, BigDecimal valor) throws SQLException{
        Quartos quarto=new Quartos();
        quarto.setNumero(numero);
        quarto.setTipo(tipo);
        quarto.setValor_diaria(valor);
        quarto.setStatus(Quartos.Status.DISPONIVEL);
        
        qd1.adicionar(quarto);
    }

    public ArrayList<Quartos> listarQuartos() throws SQLException {
        ArrayList<Quartos>quartos=qd1.listar();
        return quartos;
    }

    public void excluir(Quartos quarto) throws SQLException {
        qd1.excluir(quarto.getId());
    }
    
}
