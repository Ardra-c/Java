package com.num;

import java.util.Scanner;

public class primenumrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		primenum(start,end);
		
		
	}
	static void primenum(int start,int end) {
		for(int i=start;i<=end;i++) {
			if(isprime(i)) {
s				System.out.println(i);
			}
		}
	}
	static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
