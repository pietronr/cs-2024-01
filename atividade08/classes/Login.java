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
        boolean usuarioValido = this.usuario.equals(usuario);
        boolean senhaValida = this.senha.equals(senha);

        if (!usuarioValido && !senhaValida) {
            throw new LoginInvalidoException("Usuário e senha incorretos");
        }
        if (!usuarioValido) {
            throw new LoginInvalidoException("Usuário incorreto");
        }
        else if (!senhaValida) {
            throw new LoginInvalidoException("Senha incorreta");
        } else {
            return true;
        }
    }
}
