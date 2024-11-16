package com.kod.dsa.array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int ages[];
		ages=new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<= ages.length-1;i++) {
			ages[i] = scan.nextInt();
		}
		for(int i=0;i<=ages.length-1;i++) {
			System.out.println(ages[i]);
		}

	}

}
