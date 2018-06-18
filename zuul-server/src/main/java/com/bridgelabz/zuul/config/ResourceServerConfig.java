package com.bridgelabz.zuul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	/*@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requestMatchers().and().authorizeRequests().antMatchers("/actuator/**", "/api-docs/**", "/forex/**").permitAll()
				// .antMatchers("/springjwt/**" ).authenticated();
				.antMatchers("/currency-converter/secured/read").hasAnyAuthority("FOO_READ")
				.antMatchers("/currency-converter/secured/write").hasAnyAuthority("FOO_WRITE").anyRequest()
				.authenticated();
	}*/
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requestMatchers().and().authorizeRequests().antMatchers("/**").permitAll();
	}
	
}
