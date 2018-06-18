package com.bridgelabz.forex.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.forex.models.ExchangeValue;
import com.bridgelabz.forex.repositories.ExchangeValueRepository;

@RestController
public class ForexController {

	@Value("${server.port}")
	private int port;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrievExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = exchangeValueRepository.findByCurrencyFromAndCurrencyTo(from, to);
		exchangeValue.setPort(port);
		return exchangeValue;
	}
	
	@GetMapping("/random")
	public String getRandomString() {
		throw new RuntimeException("Yo");
		//return "String: " + UUID.randomUUID().toString();
	}
	
}
