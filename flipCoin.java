package com.bridelabz.demo;

public class flipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int headcount = 0;
		int tailcount = 0;
double coin = Math.floor(Math.random() *10) % 2;
	if(coin < 0.5)
	{
	System.out.println("It is tails");
	}
	else
	{
	System.out.println("It is heads");

	}
	
}
}
