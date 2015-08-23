package com.hu.clinicalapp.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="availability")
public class Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="available_id", unique = true, nullable = false)
	private Long availableId;
	
	@Column(name="avialableTime")
	private Calendar avialableTime;
	
	@ManyToOne
	private Doctor doctor;
	
	public Calendar getAvialableTime() {
		return avialableTime;
	}

	public void setAvialableTime(Calendar avialableTime) {
		this.avialableTime = avialableTime;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Availability [availableId=" + availableId + ", avialableTime="
				+ avialableTime + ", doctor=" + doctor + "]";
	}
	
	
}
