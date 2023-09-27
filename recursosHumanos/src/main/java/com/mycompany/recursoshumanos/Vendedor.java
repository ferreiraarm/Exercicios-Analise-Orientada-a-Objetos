/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanos;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Vendedor extends Funcionario{
    private int qtdVendas;
   public Vendedor(){};
    public Vendedor(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Vendedor(int qtdVendas, String nome, String matricula, double salario) {
        super(nome, matricula, salario);
        this.qtdVendas = qtdVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
    
}
