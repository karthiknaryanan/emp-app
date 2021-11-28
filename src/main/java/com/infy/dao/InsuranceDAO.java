package com.infy.dao;

import java.util.List;

import com.infy.model.Policy;

public interface InsuranceDAO {

	public String buyPolicy(Policy policy);
	
	public List<Policy> getAllPolicyDetails();
}
