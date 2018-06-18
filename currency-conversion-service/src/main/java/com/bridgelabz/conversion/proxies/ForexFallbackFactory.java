package com.bridgelabz.conversion.proxies;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class ForexFallbackFactory implements FallbackFactory<CurrencyExchangeServiceProxy> {

	@Override
	public CurrencyExchangeServiceProxy create(Throwable t) {
		return new ForexFallback(t);
	}

}
