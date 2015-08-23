package com.hu.clinicalapp.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="appointment_id")
	private Long appointmentId;
	
	@Column(name="appointmentDate")
	private Calendar appointmentDate;
	
	@OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH })
	@JoinColumn(name="doctor_id")
	private Doctor doctor;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patient;
	

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Calendar getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Calendar appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId
				+ ", appointmentDate=" + appointmentDate + ", doctor=" + doctor
				+ ", patient=" + patient + "]";
	}
	
	
	
}
