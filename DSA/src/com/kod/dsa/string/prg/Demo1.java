package com.kod.dsa.string.prg;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
		System.out.println("Before reversing:"+str);
	/*	StringManipulation strMan=new StringManipulation();
		String res=strMan.reverse(str);
		System.out.println("After reversing:"+res);*/
		StringManip rev=new StringManip();
		String res=rev.reverseSet(str);
		System.out.println("After reversing:"+res);
	}

}
