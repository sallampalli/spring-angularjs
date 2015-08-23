/**
 * 
 */
package com.hu.clinicalapp.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hu.clinicalapp.domain.Doctor;
import com.hu.clinicalapp.service.DoctorService;

/**
 * @author AllSa002
 * 
 */

@RestController
@RequestMapping("/clinic")
public class DoctorResource {

	private Logger log = Logger.getLogger(DoctorResource.class);
	
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value = "/doctor/create", method = RequestMethod.POST, produces = "application/json", consumes="application/json")
	public Doctor createDoctor(@RequestBody Doctor doctor, HttpServletResponse response) throws Exception{
		log.debug("Dcotor to save :"+doctor.toString());
		return doctorService.createDoctor(doctor);
	}
	
	@RequestMapping(value = "/doctors", method = RequestMethod.GET, produces = "application/json")
	public List<Doctor> getDoctors(HttpServletResponse response){
		return doctorService.getDoctors();
	}
	
	@RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET, produces = "application/json")
	public Doctor getDoctor(@PathVariable Long id){
		return doctorService.getDoctor(id);
	}
	
	
	
	

}
