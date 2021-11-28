package com.infy.validator;

import java.time.LocalDate;
import java.time.Period;

import com.infy.model.Policy;

public class Validator {

	public static String validate(Policy policy) {
		validatePolicyName(policy.getPolicyName());
		return null;
	}

	public static boolean validatePolicyName(String policyName) {
		if (!policyName.isEmpty() && policyName.matches("[a-zA-Z]"))
			return true;
		return false;
	}

	public static boolean validatePolicyType(String policyType) {
		switch (policyType) {
		case "Term Life Insurance":
			return true;
		case "Whole Life Policy":
			return true;
		case "Endowment Plans":
			return true;
		default:
			return false;
		}
	}

	public static boolean validatePremium(Double premium) {
		if (premium > 100)
			return true;
		return false;
	}

	public static boolean validateTenure(Integer tenureInMonths) {
		if (tenureInMonths > 24)
			return true;
		return false;
	}

	public static boolean validateDateOfBirth(LocalDate dateOfBirth) {
		Period period = Period.between(dateOfBirth, LocalDate.now());
		if (period.getDays() > 0)
			return true;
		return false;
	}

	public static boolean validatePolicyNumber(String policyNumber, String policyType) {
		if (policyType.equals("TL") && policyNumber.matches("TL-[\\d]{6}")) {
			return true;
		} else if (policyType.equals("WL") && policyNumber.matches("WL-[\\d]{6}")) {
			return true;
		} else if (policyType.equals("EP") && policyNumber.matches("EP-[\\d]{6}")) {
			return true;
		}
		return false;
	}

	public static boolean validatePolicyHolderName(String policyHolderName) {
		String[] words =policyHolderName.split(" ");
		int wordsInName = words.length;
		if(wordsInName>0 && words[0].length()>=3 )return true;
		return false;
	}

}
