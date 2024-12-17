package com.kod.exception.customExceptionHandling;

public class Bank {
		void intiate() {
			ATM atm=new ATM();
			try {
			atm.withdraw();
			}catch(Exception e) {
				try {
					atm.withdraw();
				}catch(Exception e1) {
					try {
					atm.withdraw();
					}catch(Exception e2) {
				System.out.println("You are Theif, Get LOST......");
			}
			}
		}
		}
}
