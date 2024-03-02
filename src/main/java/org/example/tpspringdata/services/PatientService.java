package org.example.tpspringdata.services;

import lombok.AllArgsConstructor;
import org.example.tpspringdata.dao.PatientRepository;
import org.example.tpspringdata.entities.Patient;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class PatientService {
    private PatientRepository patientRepository;
    public Patient ajouterPatient(Patient patient) {
        return patientRepository.save(patient);}
    public List<Patient> consulterTousLesPatients() {
        return patientRepository.findAll();}
    public Patient consulterPatientParId(Long id) {
        return patientRepository.findById(id).get();}
    public List<Patient> chercherPatientsParNom(String nom) {
        return patientRepository.findByNomContainsIgnoreCase(nom); }
    public Patient mettreAJourPatient(Patient patient) {
        return patientRepository.save(patient);}
    public void supprimerPatientParId(Long id) {
        patientRepository.deleteById(id);
    }
}