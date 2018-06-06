package com.bridgelabz.forex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.forex.models.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
}
