package com.kod.exception.managingException;

import java.util.Scanner;

public class ATM {
	void authenticate() throws Exception{
		try {
		System.out.println("Connection to database established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers with max 2 digits that is userId and pwd for division authentication");
		int UserId=scan.nextInt();
		int pwd=scan.nextInt();
		int res=UserId/pwd;
		System.out.println("Authentication division result: "+res);
		}
//	}catch(Exception e) {
//		System.out.println("Exception Generated in ATM and resolved");
//		throw e;
//	}
		finally {
		System.out.println("Connection to database terminated");
		}
}
}
