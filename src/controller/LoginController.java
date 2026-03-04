package controller;
import java.sql.SQLException;
import model.Funcionario;
import view.*;


public class LoginController{
        private String login;
        private String senha;

        public LoginController(String login, String senha) {
            this.login = login;
            this.senha = senha;
 }
    
    public boolean login() throws SQLException{
            Funcionario fc1=new Funcionario();
            boolean autenticado=fc1.verificarAcesso(login, senha);
            if(autenticado==true){
                new MenusView(fc1.verificarCargo(login, senha)).setVisible(true);
            }
            return autenticado;
    }
}
    

