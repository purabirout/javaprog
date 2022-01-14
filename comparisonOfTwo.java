package com.bridelabz.demo;

import java.util.Scanner;

public class comparisonOfTwo {
		
   public static void main(String arg[])	
	{
        
            double dis;
            Scanner sc = new Scanner(System.in);   
            System.out.print("Enter value x1- ");  
            int x1 = sc.nextInt();  
            System.out.print("Enter value x2- ");  
            int x2 = sc.nextInt();  
            System.out.print("Enter value y1- ");  
            int y1 = sc.nextInt(); 
            System.out.println("Enter value y2-");
            int y2 =sc.nextInt();
    	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	       
            System.out.println("Distance between above points: "+"("+x1+","+y1+"),"+"("+x2+","+y2+") == " +dis);
	}

}
