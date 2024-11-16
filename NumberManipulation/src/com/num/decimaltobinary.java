package com.num;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		BinarytDecimal B = new BinarytDecimal();
		String res=B.binary(n);
		System.out.println("Binary of number "+n+" is "+res);
	}

}
