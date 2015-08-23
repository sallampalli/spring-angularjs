/**
 * 
 */
package com.hu.clinicalapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.clinicalapp.domain.Appointment;
import com.hu.clinicalapp.domain.Doctor;
import com.hu.clinicalapp.domain.Patient;
import com.hu.clinicalapp.repository.AppointmentRepository;
import com.hu.clinicalapp.repository.DoctorRepository;

/**
 * @author AllSa002
 * 
 */
@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appRepo;
	
	@Autowired
	DoctorRepository docRepo;

	public List<Appointment> getAppointments() {

		return appRepo.findAll();
	}

	public Appointment createAppointment(Appointment app) {
		return appRepo.save(app);
	}
	
	public Appointment getAppointment(long app_id){
		
		return appRepo.findOne(app_id);
	}
	
	public void deleteAppointment(long app_id){
		
		appRepo.delete(app_id);
	}
	
	

}
