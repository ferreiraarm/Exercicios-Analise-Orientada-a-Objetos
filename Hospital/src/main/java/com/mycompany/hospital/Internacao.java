/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author artur
 */
public class Internacao {
    private Enfermaria qtEn;
    private Apartamento apt;
    private Medico medic;
    private Enfermeiro enferm;

    public Internacao(){};
    public Internacao(Enfermaria qtEn, Apartamento apt, Medico medic, Enfermeiro enferm) {
        this.qtEn = qtEn;
        this.apt = apt;
        this.medic = medic;
        this.enferm = enferm;
    }

    
    public Enfermaria getQtEn() {
        return qtEn;
    }

    public void setQtEn(Enfermaria qtEn) {
        this.qtEn = qtEn;
    }

    public Apartamento getApt() {
        return apt;
    }

    public void setApt(Apartamento apt) {
        this.apt = apt;
    }

    public Medico getMedic() {
        return medic;
    }

    public void setMedic(Medico medic) {
        this.medic = medic;
    }

    public Enfermeiro getEnferm() {
        return enferm;
    }

    public void setEnferm(Enfermeiro enferm) {
        this.enferm = enferm;
    }
    
    
}
