package com.revature.project1.services;

public class Verification {
	public static Double convertToDouble(String input) throws Exception {
		double amount;
		try {
			amount = Double.valueOf(input);
			return amount;
		} catch (NumberFormatException e) {
			throw new Exception();
		}

	}
}
