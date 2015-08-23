/**
 * 
 */
package com.hu.clinicalapp.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hu.clinicalapp.domain.Patient;
import com.hu.clinicalapp.service.PatientService;

/**
 * @author AllSa002
 * 
 */

@RestController
@RequestMapping("/clinic")
public class PatientResource {

	private Logger log = Logger.getLogger(PatientResource.class);

	@Autowired
	PatientService patientService;

	@RequestMapping(value = "/patient/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Patient createPatient(@RequestBody Patient patient,
			HttpServletResponse response) {
		log.debug("Patient to save :" + patient.toString());
		return patientService.createPatient(patient);
	}

	@RequestMapping(value = "/patient/genders", method = RequestMethod.GET, produces = "application/json")
	public List<String> getPatientGenders() {

		return patientService.getUniquePatients();
	}


}
