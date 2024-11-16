package com.num;

import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isperfect=false;
		isperfect=checkperfect(n);
		if(isperfect) {
			System.out.println("Yes It is Perfect Square");
		}else {
			System.out.println("No It is not a perfect Square");
		}
		

	}

	private static boolean checkperfect(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}

}
