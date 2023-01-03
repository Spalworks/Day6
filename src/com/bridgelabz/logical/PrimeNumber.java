package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		sc.close();
		
		boolean flag = true;
		
		if(num < 2)
	     {
	         flag = false;
	     }
	     else
	     {
	         for(int i=2; i <= num/2; i++)
	         {
	        	 //System.out.println("i= "+i);
	             if(num % i == 0)
	             {
	                 flag = false;
	           
	                 break;
	             }
	         }
	     }

	    String check = flag ? "is a Prime number" : "is not a Prime number";
	    System.out.println (num +" "+ check);

	}

}