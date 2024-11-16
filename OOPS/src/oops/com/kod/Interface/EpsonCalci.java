package oops.com.kod.Interface;

import java.util.Scanner;

public class EpsonCalci implements Calculator {
	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0 & b==0) {
			System.out.println("Do you need calculator for it");
		}else {
			System.out.println(a+b);
		}
		
	}

	@Override
	public void sub() {
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0 & b==0) {
			System.out.println("Do you need calculator for it");
		}else {
			System.out.println(a-b);
		}
		
	}

}
