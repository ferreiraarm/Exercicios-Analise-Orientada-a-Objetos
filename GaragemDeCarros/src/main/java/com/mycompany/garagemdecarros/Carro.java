/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garagemdecarros;

/**
 *
 * @author artur
 */
public class Carro {
    private String marca;
    private String modelo;
    private String categoria;
    
    public Carro(){};
    public Carro(String marca, String modelo, String categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
    }

public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

