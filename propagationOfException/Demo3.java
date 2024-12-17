package com.kod.exception.propagationOfException;

import java.util.Scanner;

public class Demo3 {

	void divide() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 number to divide:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Result: "+c);
	}

}
