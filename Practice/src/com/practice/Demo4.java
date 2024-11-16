package com.practice;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		int max=0,count=0;
		for(int i=0;i<str.length();i++) {
			if(i%n==0) {
				max=Math.max(count, max);
				count=0;
			}
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		max=Math.max(count, max);
		System.out.println(max);

	}

}
