package com.bridelabz.demo;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int dividend = sc.nextInt();
		System.out.println("enter the number:");
		int divisor = sc.nextInt();
		    int quotient = dividend / divisor;
		    int remainder = dividend % divisor;

		    System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
		  }
	}


