package org.example.tpspringdata.dao;
import org.example.tpspringdata.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Long> {
        List<Patient> findByNomContainsIgnoreCase(String kw);

}
