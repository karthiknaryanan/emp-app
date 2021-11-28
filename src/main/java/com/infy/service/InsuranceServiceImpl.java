package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Validation;

import com.infy.dao.InsuranceDAO;
import com.infy.model.Policy;
import com.infy.validator.Validator;

public class InsuranceServiceImpl {

	@Autowired
	private InsuranceDAO insuranceDAO;
	
	public String buyPolicy(Policy policy) {
		
		String validate = Validator.validate(policy);
		return validate;
	}
}
