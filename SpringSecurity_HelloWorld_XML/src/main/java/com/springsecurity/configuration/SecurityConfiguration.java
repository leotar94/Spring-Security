package com.springsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("leo").password("ciao").roles("USER");
		auth.inMemoryAuthentication().withUser("ADMIN").password("admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("DBA").password("dba").roles("ADMIN","DBA");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/","/home").permitAll().antMatchers("/admin/**").access("hasRole('ADMIN')")
		.antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')").and().formLogin().and().exceptionHandling().accessDeniedPage("/Access_Denied");
	}
	
}
