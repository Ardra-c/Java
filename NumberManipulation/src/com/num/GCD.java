package com.num;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		System.out.println("GCD is:"+m);

	}

}
