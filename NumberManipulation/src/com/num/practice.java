package com.num;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		int digit=0;
		String s=""+n;
		int num=s.length();
		while(n!=0){
			int rem=n%10;
			
			digit=digit+(int)Math.pow(rem,num);
			n=n/10;
		}
		System.out.println("Count is:"+digit);
	}
}
