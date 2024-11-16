package com.practice;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int prd=1;
		for(int i=0;i<=n;i++) {
			int digit=n%10;
			prd*=digit;
			n=n/10;
		}
		System.out.println(prd);
	}

}
