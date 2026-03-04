package controller;

import DAO.FuncionarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Funcionario;


public class FuncionarioController {
    FuncionarioDao fc1=new FuncionarioDao();
    public void cadastrarFuncionario(String nome,String cargo,String login,String senha) throws SQLException{
        Funcionario fun=new Funcionario();
        fun.setNome(nome);
        fun.setLogin(login);
        fun.setCargo(cargo);
        fun.setSenha(senha);
        fc1.adicionar(fun);
    }
    public ArrayList<Funcionario> listarFuncionario() throws SQLException{
        return fc1.listar();
    }

    public void excluir(Funcionario funcionario) throws SQLException {
        int id=funcionario.getId();
        fc1.deletar(id);
    }
    
}
