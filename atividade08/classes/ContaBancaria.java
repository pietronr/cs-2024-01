package atividade08.classes;

import atividade08.exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public double getSaldo() {
        return saldo;
    } 

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque.");
        }
        this.saldo -= valor;
    }   
}
