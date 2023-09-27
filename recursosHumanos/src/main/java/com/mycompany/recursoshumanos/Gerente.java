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
public class Gerente extends Funcionario{


   private double abono;
   
   public Gerente(){};

    public Gerente(double abono) {
        this.abono = abono;
    }

    public Gerente(double abono, String nome, String matricula, double salario) {
        super(nome, matricula, salario);
        this.abono = abono;
    }
    

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }


}
