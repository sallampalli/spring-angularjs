package com.hu.clinicalapp.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	 private final Logger log = LoggerFactory.getLogger(MailService.class);

	    @Autowired
	    private Environment env;

	    @Inject
	    private JavaMailSenderImpl javaMailSender;

	    /**
	     * System default email address that sends the e-mails.
	     */
	    private String from;

	    @PostConstruct
	    public void init() {
	        this.from = env.getProperty("spring.mail.from");
	    }

	    @Async
	    public void sendEmail(String to, String subject, String text) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(to);
	        message.setFrom(from);
	        message.setSubject(subject);
	        message.setText(text);
	        try {
	            javaMailSender.send(message);
	            log.debug("Sent e-mail to User '{}'!", to);
	        } catch (MailException me) {
	            log.warn("E-mail could not be sent to user '{}', exception is: {}", to, me.getMessage());
	        }
	    }
}
