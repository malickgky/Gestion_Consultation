package net.lamah.gestion_consultation.service;

import net.lamah.gestion_consultation.entities.Consultation;
import net.lamah.gestion_consultation.entities.Patient;

import java.util.List;

public interface ICabinetService {

    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(Patient patient);
    Patient getPatient(long id);
    List<Patient> ALLPatients(Long id);

    void addConsultation(Consultation consultation);
    void updateConsultation(Consultation consultation);
    void deleteConsultation(Consultation consultation);
    Consultation getConsultation(long id);
    List<Consultation> ALLConsultations(Long id);

}
