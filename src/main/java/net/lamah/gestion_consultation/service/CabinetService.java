package net.lamah.gestion_consultation.service;

import net.lamah.gestion_consultation.entities.Consultation;
import net.lamah.gestion_consultation.entities.Patient;

import java.util.List;

public class CabinetService implements ICabinetService {
    @Override
    public void addPatient(Patient patient) {

    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatient(Patient patient) {

    }

    @Override
    public Patient getPatient(long id) {
        return null;
    }

    @Override
    public List<Patient> ALLPatients(Long id) {
        return List.of();
    }

    @Override
    public void addConsultation(Consultation consultation) {

    }

    @Override
    public void updateConsultation(Consultation consultation) {

    }

    @Override
    public void deleteConsultation(Consultation consultation) {

    }

    @Override
    public Consultation getConsultation(long id) {
        return null;
    }

    @Override
    public List<Consultation> ALLConsultations(Long id) {
        return List.of();
    }
}
