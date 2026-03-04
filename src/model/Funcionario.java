
package model;
import DAO.FuncionarioDao;
import java.sql.SQLException;


public class Funcionario {
   
    private int id;
    private String nome, cargo, login, senha; 

    public Funcionario(int aInt, String nome, String cargo, String login, String senha) {
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public Funcionario(String login, String senha) {
    this.login = login;
    this.senha = senha;
    }
    public Funcionario() {
    // construtor vazio
    }
    @Override
    public String toString(){
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean verificarAcesso(String login, String senha) throws SQLException{
        FuncionarioDao fcd1=new FuncionarioDao();
        boolean acesso=fcd1.autenticar(login,senha);
        return acesso;
    }
    public String verificarCargo(String login, String senha) throws SQLException{
        FuncionarioDao fcd1=new FuncionarioDao();
        String cargo=fcd1.autenticarCargo(login,senha);
        return cargo;
    }
}
