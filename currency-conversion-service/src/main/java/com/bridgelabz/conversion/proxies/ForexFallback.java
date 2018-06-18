package com.bridgelabz.conversion.proxies;

import com.bridgelabz.conversion.models.CurrencyConversionBean;

public class ForexFallback implements CurrencyExchangeServiceProxy {
	
	private Throwable throwable;
	
	public ForexFallback(Throwable throwable) {
		this.throwable = throwable;
	}

	@Override
	public CurrencyConversionBean retrieveExchangeValue(String from, String to) {
		System.out.println(throwable.getMessage());
		CurrencyConversionBean ccb = new CurrencyConversionBean();
		return ccb;
	}

	@Override
	public String getRandomString() {
		System.out.println(throwable.getMessage());
		return "Default String";
	}

}
