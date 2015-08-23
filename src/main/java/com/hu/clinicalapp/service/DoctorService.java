/**
 * 
 */
package com.hu.clinicalapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.clinicalapp.domain.Doctor;
import com.hu.clinicalapp.repository.DoctorRepository;

/**
 * @author AllSa002
 * 
 */
@Service
public class DoctorService {

	@Autowired
	DoctorRepository docRepo;
	

	public Doctor createDoctor(Doctor doctor) throws Exception {
		// TODO Auto-generated method stub
		if(docRepo.findOne(doctor.getDoctor_id())!=null){
			throw new Exception("CLASS_ALREADY_EXISTS");
		} 
		return docRepo.save(doctor);
	}

	public List<Doctor> getDoctors() {

		return docRepo.findAll();
	}
	
	public Doctor getDoctor(Long id) {
		
		Doctor doc =  docRepo.findOne(id);
		System.out.println("Doctor :"+doc);
		
		return doc;
	}

}
