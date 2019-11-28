package com.coverletter.main.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SpringSecurityConf extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
			.antMatchers("/Form/**").permitAll()
			.antMatchers("/api/**").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.and()
			.httpBasic();
		super.configure(http);
	}
	
}
