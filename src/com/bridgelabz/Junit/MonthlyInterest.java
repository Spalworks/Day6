package com.bridgelabz.Junit;

public class MonthlyInterest {

	public static void main(String[] args) {
		
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double n = 12 * Y;
		double r = R / (12*100);
		
		double payment = (P * r) / (1 - Math.pow((1+r), -n));
		
		System.out.printf("Monthly payment will be : " + payment);
	}

}
