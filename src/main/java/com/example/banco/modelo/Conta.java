package com.example.banco.modelo;

import com.example.banco.utill.BancoDeDados;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }
    public void depositar (double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void gravar (BancoDeDados banco){
        banco.gravar(this);
    }
}
