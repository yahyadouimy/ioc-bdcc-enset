package org.example.tpspringdata.web;
import lombok.AllArgsConstructor;
import org.example.tpspringdata.entities.Patient;
import org.example.tpspringdata.services.PatientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/patients")
@AllArgsConstructor
public class PatientController {
    private PatientService patientService;
    @PostMapping("/")
    public Patient ajouterPatient(@RequestBody Patient patient) {
        return patientService.ajouterPatient(patient);
    }
    @GetMapping("/")
    public List<Patient> consulterTousLesPatients() {
        return patientService.consulterTousLesPatients();
    }
    @GetMapping("/{id}")
    public Patient consulterPatientParId(@PathVariable Long id) {
        return patientService.consulterPatientParId(id);
    }
    @GetMapping("/chercher")
    public List<Patient> chercherPatientsParNom(@RequestParam String nom) {
        return patientService.chercherPatientsParNom(nom); }
    @PutMapping("/{id}")
    public Patient mettreAJourPatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.mettreAJourPatient(patient);}
    @DeleteMapping("/{id}")
    public void supprimerPatientParId(@PathVariable Long id) {
        patientService.supprimerPatientParId(id);
    }
}
