package com.revature.project1.services;

public class Verification {
	public static Double convertToDouble(String input) throws Exception {
		
		try {
			double amount = Double.parseDouble(input);
			return amount;
		} catch (Exception e) {
			return 0.0;
		}

	}
	public static Integer intCheck(String input) {
		try {
			int id = Integer.parseInt(input);
			return id;
		}catch(Exception e) {
			return 0;
		}
	}
}
