package com.jaydot2.caching.geodecaching.repository;

import com.jaydot2.caching.geodecaching.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
