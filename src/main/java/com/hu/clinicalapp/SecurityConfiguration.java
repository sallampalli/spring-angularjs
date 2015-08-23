package com.hu.clinicalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/clinic/**")
				.hasAnyRole("ADMIN", "USER").antMatchers("/clinic/test")
				.hasRole("USER").anyRequest().authenticated().and().formLogin()
				.and().logout().logoutUrl("/app/logmeout").permitAll().and().csrf().disable();

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password")
				.authorities("ROLE_USER");
		auth.inMemoryAuthentication().withUser("admin").password("admin")
				.authorities("ROLE_ADMIN", "ROLE_USER");
	}

}
