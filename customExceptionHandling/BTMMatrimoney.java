package com.kod.exception.customExceptionHandling;

public class BTMMatrimoney {
		void initiateRegistration() {
			try {
			MatrimoneyUser mu=new MatrimoneyUser();
			mu.acceptData();
			}catch(Exception e) {
				System.out.println("Invalid user!!!");
			}
		}
}
