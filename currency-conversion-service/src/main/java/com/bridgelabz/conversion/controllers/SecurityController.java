package com.bridgelabz.conversion.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.conversion.proxies.CurrencyExchangeServiceProxy;

@RestController
@RequestMapping("/secured")
public class SecurityController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/read")
	public String readFoo() {
		return "read foo " + UUID.randomUUID().toString();
	}

	@GetMapping("/write")
	public String writeFoo() {
		return "write foo " + UUID.randomUUID().toString();
	}
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name, @RequestHeader("AUthorization") String token) {
		System.out.printf("Request with name %s inside CURRENCY SERVICE", name);
		return proxy.sayHello(name, token);
	}
}
