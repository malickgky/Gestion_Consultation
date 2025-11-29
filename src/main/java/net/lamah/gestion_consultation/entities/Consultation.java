package net.lamah.gestion_consultation.entities;

import java.sql.Date;

public class Consultation {
    private long id;
    private Date Consultation;
    private String description;
    private Patient patient;

    public Consultation() {
    }

    public Consultation(Date consultation, String description, Patient patient) {
        Consultation = consultation;
        this.description = description;
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getConsultation() {
        return Consultation;
    }

    public void setConsultation(Date consultation) {
        Consultation = consultation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
