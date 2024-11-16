package com.num;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		CheckArmstrong c =new CheckArmstrong();
		boolean res = c.checkArms(n);
		if(res==true) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
