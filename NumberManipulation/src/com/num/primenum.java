package com.num;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int orgnum=n;
		int sum=0;
		String s=""+n;
		int num=s.length();
		while(n!=0) {
			int digit=n%10;
			sum=sum+(int)Math.pow(digit,num);
			n=n/10;
		}
		if(orgnum==sum) {
			System.out.println(orgnum+" is arms");
		}else {
			System.out.println(orgnum+" is not arms");
		}
}
}
