package com.practice;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start day");
		String startDay=scan.next();
		System.out.println("Enter no of days");
		int n=scan.nextInt();

		String arr[]= {"Mon","Tue","Wed","Thur","Fri","Sun"};
		
		int startIndex=-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==startDay) {
				startIndex=i;
			}
		}
		int sunCount=0;
		for(int i=0;i<n;i++) {
			if((startIndex+i)%7==0) {
				sunCount++;
			}
		}
		System.out.println(sunCount);
	}

}
