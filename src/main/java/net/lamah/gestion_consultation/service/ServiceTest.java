package net.lamah.gestion_consultation.service;

import net.lamah.gestion_consultation.dao.ConsultationDao;
import net.lamah.gestion_consultation.dao.PatientDao;
import net.lamah.gestion_consultation.entities.Patient;

public class ServiceTest {
    public static void main(String[] args) {
        ICabinetService service=new CabinetService(new PatientDao(),new ConsultationDao());
        Patient patient=new Patient();
        patient.setNom("LAMAH");
        patient.setPrenom("Elie");
        patient.setTel("1234567890");
        service.addPatient(patient);
    }
}
