package com.example.demo;

import java.time.LocalDate;
import java.time.Period;

public class Sample {

	public static boolean validateDateOfBirth(LocalDate dateOfBirth) {
		Period period = Period.between(dateOfBirth, LocalDate.now());
		if (period.getDays()>0)
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
	
	public static void main(String[] args) {
		boolean result =validatePolicyNumber("EP-12356","EP");
	System.out.println(result);
	}
}
