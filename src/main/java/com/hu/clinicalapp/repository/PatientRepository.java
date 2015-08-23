package com.hu.clinicalapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hu.clinicalapp.domain.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	@Query("select distinct p.gender from Patient p")
	List<String> getUniquePatients();
	
}

