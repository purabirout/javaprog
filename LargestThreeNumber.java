package com.bridelabz.demo;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("enter the second number:");
		int n2 = sc.nextInt();
		System.out.println("enter the three number:");
		int n3 = sc.nextInt();
		if(n1 > n2 && n1 > n3)
		{
			System.out.println("n1 is the largest number");
		}
		if(n2 > n1 && n2 > n3)
		{
			System.out.println("n2 is the largest number");
		}
		if(n3 > n1 && n3 > n2)
		{
			System.out.println("n3 is the largest number");
		}
	}

}
