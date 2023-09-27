/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saladeaula;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Turma> turmas;

    public Aluno(){};
    public Aluno(String nome, String matricula, ArrayList<Turma> turmas) {
        this.nome = nome;
        this.matricula = matricula;
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }


}
