/**
 * 
 */
package com.hu.clinicalapp.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hu.clinicalapp.domain.Appointment;
import com.hu.clinicalapp.service.AppointmentService;

/**
 * @author AllSa002
 * 
 */

@RestController
@RequestMapping("/clinic")
public class AppointmentResource {

	private Logger log = Logger.getLogger(AppointmentResource.class);

	@Autowired
	AppointmentService appService;
	
	
	
	@Autowired
	MessageSource msg;
	
	@Autowired
	Environment env;

	@RequestMapping(value = "/appointments", method = RequestMethod.GET, produces = "application/json")
	public List<Appointment> getAllAppointments(HttpServletResponse response) {
		return appService.getAppointments();
	}
	
	


	@RequestMapping(value = "/appointment/{id}", method = RequestMethod.GET, produces = "application/json")
	public Appointment getAllAppointments(@PathVariable long id,
			HttpServletResponse response) {
		return appService.getAppointment(id);
	}

	@RequestMapping(value = "/appointment/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Appointment createAppointment(@RequestBody Appointment appointment,
			HttpServletResponse response) {
		log.debug("Appointment to save :" + appointment.toString());
		return appService.createAppointment(appointment);
	}

	@RequestMapping(value = "/appointment/create", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Appointment updateAppointment(@RequestBody Appointment appointment,
			HttpServletResponse response) {
		log.debug("Appointment to save :" + appointment.toString());
		return appService.createAppointment(appointment);
	}

	@RequestMapping(value = "/appointment/{app_id}", method = RequestMethod.DELETE)
	public void deleteAppointment(@PathVariable long app_id,
			HttpServletResponse response) {

		appService.deleteAppointment(app_id);
	}
	
}
