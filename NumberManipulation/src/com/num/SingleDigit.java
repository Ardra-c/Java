package com.num;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=n;
		while(sum>9) {
			sum=singlesum(sum);
		}
		System.out.println("Single digit sum is: "+sum);
	}
		static int singlesum(int n) {
				int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
}
