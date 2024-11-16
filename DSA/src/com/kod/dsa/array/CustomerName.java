package com.kod.dsa.array;

import java.util.Scanner;

public class CustomerName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of customer:");
//		int a=scan.nextInt();
		String customer[];
		customer=new String[scan.nextInt()];
		System.out.println("Enter " +customer.length+" name");
		for(int i=0;i<=customer.length-1;i++) {
			System.out.println("Enter " +i+" name");
			customer[i]=scan.next();
			}
		System.out.print("[");
		for(int i=0;i<=customer.length-1;i++) {
			if(i<customer.length-1) {
			System.out.println(customer[i] + " ");
			}else {
				System.out.println(customer[i]);
			}
		}
		System.out.print(" ]");
	}

}
