package com.num;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year:");
		int n=sc.nextInt();
		leapYear l=new leapYear();
		l.leap(n);

	}
	  public static void leap(int year) {
		if(year%4==0 && year%100!=0) {
			System.out.println(year+" is leap year");
		}else if(year%400 == 0) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
	}
}
