/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author artur
 */
public class Medico extends Funcionario{
    private int crm;

    public Medico(){};
    public Medico(int crm) {
        this.crm = crm;
    }

    public Medico(int crm, String nome, double salario, int id) {
        super(nome, salario, id);
        this.crm = crm;
    }

    
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
    
}
