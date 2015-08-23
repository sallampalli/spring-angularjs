package com.hu.clinicalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.clinicalapp.domain.Availability;


public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
	
}

