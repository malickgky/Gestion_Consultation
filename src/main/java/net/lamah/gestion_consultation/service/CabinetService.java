package net.lamah.gestion_consultation.service;

import net.lamah.gestion_consultation.dao.IConsulationDao;
import net.lamah.gestion_consultation.dao.IPatientDao;
import net.lamah.gestion_consultation.entities.Consultation;
import net.lamah.gestion_consultation.entities.Patient;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CabinetService implements ICabinetService {
    private IPatientDao patientDao;
    private IConsulationDao iConsultationDao;

    public CabinetService(IPatientDao patientDao, IConsulationDao iConsultationDao) {
        this.patientDao = patientDao;
        this.iConsultationDao = iConsultationDao;
    }

    @Override
    public void addPatient(Patient patient) {
        try {
            patientDao.create(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updatePatient(Patient patient) {
        try {
            patientDao.update(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deletePatient(Patient patient) {
        try {
            patientDao.delete(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Patient getPatient(long id) {
        Patient patient;
        try {
            patient=patientDao.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patient;
    }

    @Override
    public List<Patient> ALLPatients(Long id) {
        List<Patient> patients;
        try {
             patients=patientDao.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patients;
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
