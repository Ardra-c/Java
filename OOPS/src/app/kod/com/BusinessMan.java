package app.kod.com;

import java.util.Scanner;

public class BusinessMan {
		int p;
		int t;
		static float r;
		float si;
		static {
			r=2.0f;
		}
		void takeInput() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter p:");
			p=sc.nextInt();
			System.out.println("Enter t:");
			t=sc.nextInt();
			
		}
		
		void calculateSI() {
			si=(p*r*t)/100;
		}
		
		void displaySI() {
			System.out.println("SI is "+si);
		}
}
