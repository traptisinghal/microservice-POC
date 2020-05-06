package com.convertcurrency.proxy;

import org.springframework.stereotype.Component;

import com.convertcurrency.entity.CurrencyConvertDetail;

@Component
public class HystrixFallback implements ICurrencyConversionFactorProxy {

	@Override
	public double getConversionFactor(String sourceCountry, String destCountry) {
		return 0.0;
	}
}
