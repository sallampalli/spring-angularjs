package com.hu.clinicalapp;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@Component
public class JacksonObjectMapper extends ObjectMapper {
	public JacksonObjectMapper() {
        registerModule(new Hibernate4Module());
        registerModule(new JodaModule());
    }
}
