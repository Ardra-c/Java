package com.kod.exception.managingException;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main connection established");
		Bank bank=new Bank();
		bank.intiateATM();
		System.out.println("Main connection terminated");
	
	}

}
