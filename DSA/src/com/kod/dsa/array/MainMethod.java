package com.kod.dsa.array;

public class MainMethod {

	public static void main(String[] args) {
		int sum=0;
		for(String x: args) {
			System.out.print(x+" ");
			sum+=Integer.parseInt(x);
		}
		System.out.println();
		System.out.println("Sum of command line argument:"+sum);
		

	}

}
