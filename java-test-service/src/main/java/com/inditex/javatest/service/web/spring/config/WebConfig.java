package com.inditex.javatest.service.web.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.inditex.javatest.api.api.PriceApiDelegate;
import com.inditex.javatest.service.web.api.PriceApiBackend;

@Configuration
public class WebConfig {

	@Primary
	@Bean
	public PriceApiDelegate priceApiDelegate() {
		return new PriceApiBackend();
	}
}
