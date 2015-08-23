package com.hu.clinicalapp.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "doctor_id")
	private Long doctor_id;
	
	@Column(name = "doctor_first_name", nullable = false)
	private String doctor_first_name;
	
	@Column(name = "doctor_last_name", nullable = false)
	private String doctor_last_name;
	
	
	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_first_name() {
		return doctor_first_name;
	}

	public void setDoctor_first_name(String doctor_first_name) {
		this.doctor_first_name = doctor_first_name;
	}

	public String getDoctor_last_name() {
		return doctor_last_name;
	}

	public void setDoctor_last_name(String doctor_last_name) {
		this.doctor_last_name = doctor_last_name;
	}


	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", doctor_first_name="
				+ doctor_first_name + ", doctor_last_name=" + doctor_last_name
				+ "]";
	}
	
	
	
}
