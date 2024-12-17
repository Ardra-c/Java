package com.kod.exception.customExceptionHandling;

import java.util.Scanner;

public class ATM {
			String pin="1111";
			void withdraw() throws InvalidPinException{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter your pin");
				String upin=scan.next();
				if(upin.equals(pin)) {
					System.out.println("Take all your money from ATM");
				}else {
					InvalidPinException ipe = new InvalidPinException();
					System.out.println(ipe.getMessage());
					throw ipe;
				}
			}
}
