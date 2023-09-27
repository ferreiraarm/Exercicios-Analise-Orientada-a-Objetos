/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author artur
 */
public class Enfermeiro extends Funcionario{
  private int coren;

    public Enfermeiro(){};
    public Enfermeiro(int coren) {
        this.coren = coren;
    }

    public Enfermeiro(int coren, String nome, double salario, int id) {
        super(nome, salario, id);
        this.coren = coren;
    }

  
    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }

  
  
}
