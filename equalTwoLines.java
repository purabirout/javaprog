package com.bridelabz.demo;

import java.util.Scanner;

public class equalTwoLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// double dist1 = sc.nextDouble();
		// Double obj1 = Double.valueOf(dist1);
		System.out.print("Enter value x1- ");
		int x1 = sc.nextInt();
		// Integer s1 = Integer.valueOf(x1);
		System.out.print("Enter value x2- ");
		int x2 = sc.nextInt();
		// Integer s2 = Integer.valueOf(x2);
		System.out.print("Enter value y1- ");
		int y1 = sc.nextInt();
		// Integer s3 = Integer.valueOf(y1);
		System.out.println("Enter value y2-");
		int y2 = sc.nextInt();
		// Integer s4 = Integer.valueOf(y2);
		double dist1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double doub1 = Double.valueOf(dist1);
		System.out.println(
				"Distance between above points: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") == " + dist1);

		Scanner sc1 = new Scanner(System.in);
//		double dist2 = sc1.nextDouble();
//		Double obj2 = new Double(dist2);
		System.out.print("Enter value x3- ");
		int x3 = sc1.nextInt();

		System.out.print("Enter value x4- ");
		int x4 = sc1.nextInt();
//        Integer p2 =  Integer.valueOf(x4);
		System.out.print("Enter value y3- ");
		int y3 = sc1.nextInt();
//        Integer p3 =  Integer.valueOf(y3);
		System.out.println("Enter value y4-");
		int y4 = sc1.nextInt();
//        Integer p4 =  Integer.valueOf(y4);

		double dist2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		Double doub2 = Double.valueOf(dist2);
		System.out.println(
				"Distance between above points: " + "(" + x3 + "," + x4 + ")," + "(" + y3 + "," + y4 + ") == " + dist2);

		System.out.println(doub1 + " .equals " + doub2 + ": " + doub1.equals(doub2));

	}

}
