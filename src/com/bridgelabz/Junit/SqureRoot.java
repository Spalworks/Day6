package com.bridgelabz.Junit;

import java.util.Scanner;

public class SqureRoot {
	
	static double squareRoot(int num) {
	    double t;
	    double sqrtroot = num / 2;
	    if(num<0){
	        System.out.println("The number cannot be negative.");
	        System.exit(0);
	    }
	    do {
	        t = sqrtroot;
	        sqrtroot = (t + (num / t)) / 2;
	    }
	    while ((t - sqrtroot) != 0);
	    return sqrtroot;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find it's square root : ");
		int num = sc.nextInt();
		
		System.out.println("The square root of the number " + num + " is : " + squareRoot(num));
		
	}
}
