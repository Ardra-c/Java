package com.practice;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
			System.out.println("Enter positive integer:");
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			int numBits=Integer.toBinaryString(num).length();
			int mask=(1<<numBits)-1;
			int toggle=num^mask;
			System.out.println(toggle);
			
	}

}
