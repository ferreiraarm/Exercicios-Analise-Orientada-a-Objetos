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
public class SalaDeAula {
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turmas;
    private ArrayList<Professor> professores;

    public SalaDeAula(){};
    public SalaDeAula(ArrayList<Aluno> alunos, ArrayList<Turma> turmas, ArrayList<Professor> professores) {
        this.alunos = alunos;
        this.turmas = turmas;
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

}
