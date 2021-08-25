package com.inditex.javatest.service.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.inditex.javatest.business.spring.config", "com.inditex.javatest.service.web.spring.config",
		"com.inditex.javatest.service.web.mapper", "com.inditex.javatest.business.service.mapper",
		"com.inditex.javatest.api.api" })
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
