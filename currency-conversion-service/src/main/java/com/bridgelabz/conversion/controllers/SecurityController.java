package com.bridgelabz.conversion.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class SecurityController {

	@GetMapping("/read")
	public String readFoo() {
		return "read foo " + UUID.randomUUID().toString();
	}

	@GetMapping("/write")
	public String writeFoo() {
		return "write foo " + UUID.randomUUID().toString();
	}
}
