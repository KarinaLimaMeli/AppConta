package com.example.banco.modelo;

import com.example.banco.utill.MongoBD;
import com.example.banco.utill.MySQL;

import java.util.ArrayList;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial cc2 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoBD mongoBD = new MongoBD();


        //Ex
        ArrayList<Conta> contas = new ArrayList();

        for (Conta c: contas) { // foreach : para cada conta da estrutura contas
            System.out.println("Conta:" + c.getNumero());
        }

        contas.add(cc1);
        contas.add(cc1);

        // EX
        //cc1.gravar(mySQL);
       // cc2.gravar(mongoBD);
    }
}
