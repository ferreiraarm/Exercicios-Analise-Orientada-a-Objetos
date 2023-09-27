/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Main {
    public static void main(String[] args){
     
          boolean c = true;
          Medico m = new Medico();
          Enfermaria enfm = new Enfermaria();
          Enfermeiro en = new Enfermeiro();
          Apartamento aptm = new Apartamento();
          Medico mx = new Medico();
          Enfermaria enfmx = new Enfermaria();
          Enfermeiro enx = new Enfermeiro();
          Apartamento aptmx = new Apartamento();
          Internacao intern = new Internacao();
          Hospital hosp = new Hospital();
          
          ArrayList<Medico> medicos = new ArrayList<Medico>();
          ArrayList<Enfermaria> enfermarias = new ArrayList<Enfermaria>();
          ArrayList<Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();
          ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();
          ArrayList<Internacao> internacoes = new ArrayList<Internacao>();
          
        while(c=true){
         JOptionPane.showMessageDialog(null, "continuar cadastrando?S para sim e N para não");
         String t =  JOptionPane.showInputDialog("s ou n");
         
         if(t == "s"){
             c=true;
             JOptionPane.showMessageDialog(null, "Cadastre o medico");
             m.setNome(JOptionPane.showInputDialog("digite o nome do medico"));
             m.setCrm(Integer.parseInt(JOptionPane.showInputDialog("digite o crm do medico")));
             m.setId(Integer.parseInt(JOptionPane.showInputDialog("digite o id do medico")));
             m.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o salario do medico")));
             
             JOptionPane.showMessageDialog(null, "Cadastre o enfermeiro");
             en.setNome(JOptionPane.showInputDialog(""));
             en.setCoren(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do coren do enfermeiro")));
             en.setId(Integer.parseInt(JOptionPane.showInputDialog("digite o id do enfermeiro")));
             en.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o salario do enfermeiro")));
             
             JOptionPane.showMessageDialog(null, "Cadastre o apartamento");
             aptm.setNome(JOptionPane.showInputDialog("digite o nome do apartamento"));
             aptm.setNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do apartamento")));
             
             JOptionPane.showMessageDialog(null, "Cadastre a enfermaria");
             enfm.setNome(JOptionPane.showInputDialog("digite o nome da enfermaria"));
             enfm.setNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da enfermaria")));
             
             JOptionPane.showMessageDialog(null, "Cadastre a internacão");
             
             JOptionPane.showMessageDialog(null, "Cadastre o medico da internação");
             mx.setNome(JOptionPane.showInputDialog("digite o nome do medico da internação"));
             mx.setCrm(Integer.parseInt(JOptionPane.showInputDialog("digite o crm do medico da internação")));
             mx.setId(Integer.parseInt(JOptionPane.showInputDialog("digite o id do medico da internação")));
             mx.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o salario do medico da internação")));
             
             JOptionPane.showMessageDialog(null, "Cadastre o enfermeiro da internação");
             enx.setNome(JOptionPane.showInputDialog(""));
             enx.setCoren(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do coren do enfermeiro da internação")));
             enx.setId(Integer.parseInt(JOptionPane.showInputDialog("digite o id do enfermeiro da internação")));
             enx.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o salario do enfermeiro da internação")));
             
             JOptionPane.showMessageDialog(null, "Cadastre o apartamento da internação");
             aptmx.setNome(JOptionPane.showInputDialog("digite o nome do apartamento da internação"));
             aptmx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do apartamento da internação")));
             
             JOptionPane.showMessageDialog(null, "Cadastre a enfermaria da internação");
             enfmx.setNome(JOptionPane.showInputDialog("digite o nome da enfermaria da internação"));
             enfmx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da enfermaria da internação")));
             
             intern.setApt(aptmx);
             intern.setEnferm(enx);
             intern.setMedic(mx);
             intern.setQtEn(enfmx);
             
             medicos.add(m);
             apartamentos.add(aptm);
             enfermarias.add(enfm);
             enfermeiros.add(en);
             internacoes.add(intern);
             
             hosp.setEnfermarias(enfermarias);
             hosp.setMedicos(medicos);
             hosp.setInternacoes(internacoes);
             hosp.setEnfermeiro(enfermeiros);
             hosp.setApartamento(apartamentos);
             
             }else{
         c=false;
         }
         
        }
         }
    
}
