/*package com.bridgelabz.zuul.config;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TokenGenerator {
	
	@PostConstruct
	public void generateToken() {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8084/oauth/token";
		
		
		template.exchange(url, HttpMethod.POST, requestEntity, String.class, uriVariables)
	}
}
*/