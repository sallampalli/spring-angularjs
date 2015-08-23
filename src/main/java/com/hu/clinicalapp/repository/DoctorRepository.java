package com.hu.clinicalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.clinicalapp.domain.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	
}

