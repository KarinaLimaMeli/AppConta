package com.example.banco.utill;

import com.example.banco.modelo.Conta;

public class MongoBD implements  BancoDeDados {
    @Override
    public void gravar(Conta conta){
        System.out.printf("Gravando no BD MongoBD a conta: %d\n", conta.getNumero());
    }

}
