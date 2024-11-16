package com.num;

import java.util.Scanner;

public class singledsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int res=ssum(n);
		System.out.println(res);

	}
	static int ssum(int n) {
		while(n>=10) {//14
			int sum=0;
			while(n != 0) {
				
			int rem=n%10; // 1
			sum=sum+rem; //5+4+3+2=14 = 5
			n=n/10; //
		}
		n=sum;
		}
		return n;
	}
}
