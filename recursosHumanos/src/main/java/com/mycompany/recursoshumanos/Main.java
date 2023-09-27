/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Main {
    public static void main(String[] args){
    
        Gerente ger = new Gerente();
        Vendedor ver = new Vendedor();
        ArrayList<Vendedor> funcisV = new ArrayList<Vendedor>();
        ArrayList<Gerente> funciG = new ArrayList<Gerente>();
        RH rh = new RH();
        boolean c = true;
        
        while(c=true){
         JOptionPane.showMessageDialog(null, "continuar cadastrando?S para sim e N para não");
         String t =  JOptionPane.showInputDialog("s ou n");
         
         if(t == "s"){
          c=true;
          JOptionPane.showMessageDialog(null, "Cadastre o gerente");
          ger.setNome(JOptionPane.showInputDialog("Digite o nome"));
          double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
          ger.setMatricula(JOptionPane.showInputDialog("Digite o matricula"));
          double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o abono"));
          ger.setSalario(x);
          ger.setAbono(x1);
          ger.setSalario(x+x1);
          
          JOptionPane.showMessageDialog(null, "Cadastre o vendedor");
          ver.setNome(JOptionPane.showInputDialog("Digite o nome"));
          double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
          ver.setMatricula(JOptionPane.showInputDialog("Digite o matricula"));
          int x3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas"));
          ver.setSalario(x2);
          ver.setQtdVendas(x3);
          
          funcisV.add(ver);
          funciG.add(ger);
          rh.setGerentes(funciG);
          rh.setVendedores(funcisV);
          
          
          
         }else{
         c=false;
         }
         
        }
        
    
    }
}
