/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saladeaula;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Main {
     public static void main(String[] args){
     
          boolean c = true;
        
        while(c=true){
         JOptionPane.showMessageDialog(null, "continuar cadastrando?S para sim e N para não");
         String t =  JOptionPane.showInputDialog("s ou n");
         
         if(t == "s"){
             c=true;
             SalaDeAula salas = new SalaDeAula();
             Professor profe = new Professor();
             Aluno al = new Aluno();
             Turma turP = new Turma();
             Turma turA = new Turma();
             Turma turS = new Turma();
             ArrayList<Aluno> alunos = new ArrayList<Aluno>();
             ArrayList<Professor> professores = new ArrayList<Professor>();
             ArrayList<Turma> turmasA = new ArrayList<Turma>();
             ArrayList<Turma> turmasP = new ArrayList<Turma>();
             ArrayList<Turma> turmasS = new ArrayList<Turma>();
             
             JOptionPane.showMessageDialog(null, "Cadastre o aluno");
             
              al.setNome(JOptionPane.showInputDialog("cadastre o nome"));
             al.setMatricula(JOptionPane.showInputDialog("cadastre a matricula do aluno"));
             turA.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("cadastre o codigo da turma do aluno")));
             turA.setNome(JOptionPane.showInputDialog("cadastre a nome da turma do aluno"));
             turmasA.add(turA);
             al.setTurmas(turmasA);
             
             JOptionPane.showMessageDialog(null, "Cadastre o professor");
             
              profe.setNome(JOptionPane.showInputDialog("cadastre o nome do professor"));
             profe.setMatricula(JOptionPane.showInputDialog("cadastre matricula do professor"));
             turP.setNome(JOptionPane.showInputDialog("cadastre o codigo da turma do professor"));
             turP.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("cadastre o codigo da turma do aluno")));
             turmasP.add(turP);
             profe.setTurmas(turmasP);                   
        
             
             JOptionPane.showMessageDialog(null, "Cadastre a turma");
             
             turS.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("cadastre o codigo da turma")));
             turS.setNome(JOptionPane.showInputDialog("cadastre o nome da turma"));
            
             
            
             
             
             
             professores.add(profe);
             alunos.add(al);
             turmasS.add(turS);
             salas.setAlunos(alunos);
             salas.setProfessores(professores);
             salas.setTurmas(turmasS);
             
             }else{
         c=false;
         }
         
        }
         }
    
}

