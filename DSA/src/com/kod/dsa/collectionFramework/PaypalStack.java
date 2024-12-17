package com.kod.dsa.collectionFramework;

import java.util.Scanner;

public class PaypalStack {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		Stacks stack=new Stacks(scan.nextInt());
		while(true) {
			System.out.println("Choose options \n Press 1 to push "
									+ "\n Press 2 to pop"
									+ "\n Press 3 to display"
									+ "\n Anyother number to exit");
			int choose=scan.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Enter element to push");
				int elem=scan.nextInt();
				stack.push(elem);
				System.out.println("========================");
				break;
			case 2:
				System.out.println("======================");
				stack.pop();
				System.out.println("===================");
				break;
			case 3:
				System.out.println("===============");
				stack.display();
				System.out.println("===============");
				break;
			default:
				System.out.println("======================");
				System.out.println("THANKS FOR USING STACK :)");
			}
		}
	}

}
