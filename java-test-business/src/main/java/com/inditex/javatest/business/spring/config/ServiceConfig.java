package com.inditex.javatest.business.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inditex.javatest.business.service.PriceService;
import com.inditex.javatest.business.service.impl.PriceServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public PriceService priceService() {
		return new PriceServiceImpl();
	}
}
