package com.hu.clinicalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.clinicalapp.domain.Appointment;
import com.hu.clinicalapp.domain.Patient;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
	
}

