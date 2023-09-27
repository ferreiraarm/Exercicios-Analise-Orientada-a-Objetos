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
public class RH {
    
   private ArrayList<Vendedor> vendedores; 
   private ArrayList<Gerente> gerentes;
   
   public RH(){};

    public RH(ArrayList<Vendedor> vendedores, ArrayList<Gerente> gerentes) {
        this.vendedores = vendedores;
        this.gerentes = gerentes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

}
