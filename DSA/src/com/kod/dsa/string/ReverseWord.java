package com.kod.dsa.string;

import java.util.Scanner;

import com.kod.dsa.string.prg.revWordMethod;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=scan.nextLine();
		revWordMethod rev=new revWordMethod();
		String res=rev.revWords(str);
		System.out.print(res);

	}

}
