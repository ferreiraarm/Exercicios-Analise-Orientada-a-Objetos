/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Hospital {

 private ArrayList<Medico> medicos;
 private ArrayList<Enfermaria> enfermarias;
 private ArrayList<Internacao> internacoes;
 private ArrayList<Apartamento> apartamento;
 private ArrayList<Enfermeiro> enfermeiro;

 public Hospital(){};

    public Hospital(ArrayList<Medico> medicos, ArrayList<Enfermaria> enfermarias, ArrayList<Internacao> internacoes, ArrayList<Apartamento> apartamento, ArrayList<Enfermeiro> enfermeiro) {
        this.medicos = medicos;
        this.enfermarias = enfermarias;
        this.internacoes = internacoes;
        this.apartamento = apartamento;
        this.enfermeiro = enfermeiro;
    }

 
    public ArrayList<Apartamento> getApartamento() {
        return apartamento;
    }

    public void setApartamento(ArrayList<Apartamento> apartamento) {
        this.apartamento = apartamento;
    }

    public ArrayList<Enfermeiro> getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(ArrayList<Enfermeiro> enfermeiro) {
        this.enfermeiro = enfermeiro;
    }
  

 

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Enfermaria> getEnfermarias() {
        return enfermarias;
    }

    public void setEnfermarias(ArrayList<Enfermaria> enfermarias) {
        this.enfermarias = enfermarias;
    }

    public ArrayList<Internacao> getInternacoes() {
        return internacoes;
    }

    public void setInternacoes(ArrayList<Internacao> internacoes) {
        this.internacoes = internacoes;
    }


}
