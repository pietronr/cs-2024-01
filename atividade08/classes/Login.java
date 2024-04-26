package atividade08.classes;

import atividade08.exceptions.LoginInvalidoException;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!this.usuario.equals(usuario)) {
            throw new LoginInvalidoException("Usuário incorreto");
        }
        else if (!this.senha.equals(senha)) {
            throw new LoginInvalidoException("Senha incorreta");
        } else {
            return true;
        }
    }
}
