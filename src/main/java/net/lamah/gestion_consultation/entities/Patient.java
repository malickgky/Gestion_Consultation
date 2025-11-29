package net.lamah.gestion_consultation.entities;

import java.util.List;

public class Patient {
    public String getTel;
    public String getPrenom;
    public String getNOM;
    private long id;
    private String nom;
    private String prenom;
    private String tel;
    private List<Consultation> Consultations;


    public Patient() {
    }

    public Patient(String nom, String prenom, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Consultation> getConsultations() {
        return Consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        Consultations = consultations;
    }
}
