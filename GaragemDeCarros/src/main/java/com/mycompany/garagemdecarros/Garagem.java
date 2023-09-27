/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garagemdecarros;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Garagem {
    private Carro carro;
    private ArrayList<Carro> car;

    public Garagem(Carro carro, ArrayList<Carro> car) {
        this.carro = carro;
        this.car = car;
    }

    public ArrayList<Carro> getCar() {
        return car;
    }

    public void setCar(ArrayList<Carro> car) {
        this.car = car;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

   
    
    public Garagem(){};
  
    
    
}
