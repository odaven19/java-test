package com.inditex.javatest.business.spring.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.inditex.javatest.business.jpa.model")
@EnableJpaRepositories("com.inditex.javatest.business.jpa.repository")
public class JPAConfig {

}
