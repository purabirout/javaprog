package com.bridelabz.demo;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth  number:");
		int num = sc.nextInt();
		int poweroftwo=1;
		for(int i=0;i<=num;i++)
		{
			System.out.println(i + " " + poweroftwo);   
            poweroftwo = 2 * poweroftwo;                
	}
	}
}
