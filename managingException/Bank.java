package com.kod.exception.managingException;

public class Bank {
			void intiateATM() {
				System.out.println("Connection to bank established");
				try {
				ATM atm=new ATM();
				atm.authenticate();
				System.out.println("Connection to bank terminated");
				}catch(Exception e) {
					System.out.println("Reached in bank and resolved");
				}
			}
}
