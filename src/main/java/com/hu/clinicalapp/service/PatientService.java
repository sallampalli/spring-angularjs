/**
 * 
 */
package com.hu.clinicalapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.clinicalapp.domain.Patient;
import com.hu.clinicalapp.repository.PatientRepository;

/**
 * @author AllSa002
 * 
 */
@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepo;

	public Patient createPatient(Patient patient) {

		return patientRepo.save(patient);
	}
	
	public List<String> getUniquePatients(){
		
		return patientRepo.getUniquePatients();
	}
}
