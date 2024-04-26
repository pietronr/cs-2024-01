package atividade08.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import atividade08.classes.Login;
import atividade08.exceptions.LoginInvalidoException;

public class LoginTests {
    @Test
    public void testeLoginCorreto() {
        Login login = new Login("usuario", "senha");
        try {
            boolean loginSucesso = login.fazerLogin("usuario", "senha");
            assertTrue(loginSucesso);
        } catch (LoginInvalidoException e) {
            fail("Erro inesperado ao fazer login: " + e.getMessage());
        }
    }

    @Test
    public void testeUsuarioIncorreto() {
        Login login = new Login("usuario", "senha");
        assertThrows(LoginInvalidoException.class, () -> login.fazerLogin("usuario_errado", "senha"));
    }

    @Test
    public void testeSenhaIncorreta() {
        Login login = new Login("usuario", "senha");
        assertThrows(LoginInvalidoException.class, () -> login.fazerLogin("usuario", "senha_errada"));
    }

    @Test
    public void testeUsuarioSenhaIncorretos() throws LoginInvalidoException {
        Login login = new Login("usuario", "senha");
        assertThrows(LoginInvalidoException.class, () -> login.fazerLogin("usuario_errado", "senha_errada"));
    }
}
