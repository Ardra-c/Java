package com.num;

import java.util.Scanner;

public class fibinocii {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		fib f=new fib();
		f.getfib(n);
	}

}
