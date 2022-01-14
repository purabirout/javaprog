package com.bridelabz.demo;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 5, b = 2;

        System.out.println("Before swap:-");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        int c = a;
        a = b;

        b = c;

        System.out.println("After swap:-");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

	}

}
