package com.bridelabz.demo;

public class Sample {
	public static void main(String [] args) {
		
		int salPerHr = 20;
		int fullDayHr = 8;
		int dailywage = 0;
		int partTimeHr = 4;
		int employee_detail = 1;
		int part_time = 2;
		int workingHr = 0;
		int totalSal = 0;
	    int day = 0;
	    //while(day<=20)
	    while(day<=20 && workingHr<=100)
		{
		int empCheck = 1;
		//double empCheck = Math.floor(Math.random() *10) % 2;
		switch(empCheck) {
		case 1:	
		System.out.println("Employee is present");
			break;
		case 2:
			System.out.println("Employee is part time worker");
			break;
			default:
				System.out.println("Employee is absent");
				break;
		}
		day = day+1;

	dailywage = (salPerHr * fullDayHr);
	System.out.println("one day salary is:" +dailywage );
	totalSal = (totalSal + dailywage);
	System.out.println("Total salary is:" +totalSal);
		workingHr=(workingHr+fullDayHr);
		System.out.println("Total working hour is:" +workingHr);
		
		
		
		}
	    
	}
}

