package com.inditex.javatest.service;

import javax.transaction.Transactional;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@AutoConfigureMockMvc
@EnableWebMvc
@EntityScan("com.inditex.javatest.business.jpa.model")
@EnableJpaRepositories("com.inditex.javatest.business.jpa.repository")
@ComponentScan(basePackages = { "com.inditex.javatest.service.web.mapper",
		"com.inditex.javatest.business.service.mapper", "com.inditex.javatest.service.web.spring.config" })
@Transactional
@AutoConfigureCache
@AutoConfigureDataJpa
@AutoConfigureTestDatabase
@AutoConfigureTestEntityManager
public class BaseITTest {
	
	@Autowired
	protected MockMvc mvc;
	
	@Autowired
	private WebApplicationContext context;
	
	protected static ObjectMapper jsonMapper = new ObjectMapper().registerModule(new JavaTimeModule());
	
	@Before
	public void init() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	protected String asJsonString(final Object obj) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.registerModule(new JavaTimeModule());
			return mapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
