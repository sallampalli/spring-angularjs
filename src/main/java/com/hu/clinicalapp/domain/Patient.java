package com.hu.clinicalapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "patient_id")
	private long patient_id;

	@Column(name = "patient_first_name")
	private String patient_first_name;

	@Column(name = "patient_last_name")
	private String patient_last_name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "problem")
	private String problem;

	public long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_first_name() {
		return patient_first_name;
	}

	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}

	public String getPatient_last_name() {
		return patient_last_name;
	}

	public void setPatient_last_name(String patient_last_name) {
		this.patient_last_name = patient_last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_first_name="
				+ patient_first_name + ", patient_last_name="
				+ patient_last_name + ", age=" + age + ", gender=" + gender
				+ ", problem=" + problem + "]";
	}

}
