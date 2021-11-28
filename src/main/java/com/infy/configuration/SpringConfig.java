package com.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.dao.InsuranceDAOImpl;
import com.infy.service.InsuranceServiceImpl;

@Configuration
public class SpringConfig {

	@Bean
	public InsuranceServiceImpl insuranceService() {
		return new InsuranceServiceImpl();
	}

	@Bean
	public InsuranceDAOImpl insuranceDAO() {
		return new InsuranceDAOImpl();
	}
}
