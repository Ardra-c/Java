package com.kod.dsa.collectionFramework;

import java.util.Scanner;

public class PaypalCircularqueue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of queue");
		CircularQueue queue=new CircularQueue(scan.nextInt());
		while(true) {
			System.out.println("Choose options \n Press 1 to insert "
									+ "\n Press 2 to delete"
									+ "\n Press 3 to display"
									+ "\n Anyother number to exit");
			int choose=scan.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Enter element to insert");
				int elem=scan.nextInt();
				queue.insert(elem);
				System.out.println("========================");
				break;
			case 2:
				System.out.println("======================");
				queue.delete();
				System.out.println("===================");
				break;
			case 3:
				System.out.println("===============");
				queue.display();
				System.out.println("===============");
				break;
			default:
				System.out.println("======================");
				System.out.println("THANKS FOR USING QUEUE :)");
			}
		}

	}

}
