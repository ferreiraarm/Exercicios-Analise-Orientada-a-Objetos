/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garagemdecarros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Main {
    
    public static void main(String[] args){
        Carro carro = new Carro();
        Garagem garagem = new Garagem();
        boolean c = true;
        ArrayList<Carro> carr = new ArrayList<Carro>();
     while(c=true){
         JOptionPane.showMessageDialog(null, "continuar cadastrando?S para sim e N para não");
         String t =  JOptionPane.showInputDialog("s ou n");
         
         if(t == "s"){
          c=true;
         }else{
         c=false;
         }
         if(c=true){
        carro.setCategoria(JOptionPane.showInputDialog("Digite a Categoria"));
        carro.setMarca(JOptionPane.showInputDialog("Digite a marca"));
        carro.setModelo(JOptionPane.showInputDialog("Digitte o modelo"));
        garagem.setCarro(carro);
        carr.add(carro);
        garagem.setCar(carr);
         }else{
         c=false;
         }
    }
    };
}
