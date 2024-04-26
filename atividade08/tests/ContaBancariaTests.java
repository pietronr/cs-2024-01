package atividade08.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

import atividade08.classes.ContaBancaria;
import atividade08.exceptions.SaldoInsuficienteException;

public class ContaBancariaTests {
    @Test
    public void testeDepositar() {
        ContaBancaria conta = new ContaBancaria(100.0);
        conta.depositar(50.0);
        assertEquals(150.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testeSacar() {
        ContaBancaria conta = new ContaBancaria(100.0);
        try {
            conta.sacar(50.0);
            assertEquals(50.0, conta.getSaldo(), 0.001);
        } catch (SaldoInsuficienteException e) {
            fail("Erro inesperado ao sacar: " + e.getMessage());
        }
    }

    @Test
    public void testeSaldoInsuficiente() {
        ContaBancaria conta = new ContaBancaria(100.0);
        assertThrows(SaldoInsuficienteException.class, () -> conta.sacar(150.0));
    }
}
