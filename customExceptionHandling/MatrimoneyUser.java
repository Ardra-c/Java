package com.kod.exception.customExceptionHandling;

import java.util.Scanner;

public class MatrimoneyUser {
			String name;
			int age;
			String gender;
			public void acceptData() throws Exception{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter name: ");
				name=scan.nextLine();
				System.out.println("Enter age: ");
				age=scan.nextInt();
				System.out.println("Enter gender: ");
				gender=scan.next();
				if(age>21 && age<50) {
					System.out.println(name+" is valid user to get Married");
				}else if(age<21) {
					underAgeException ude=new underAgeException();
					System.out.println(ude.getMessage(name));
					throw ude;
				}else {
					OverAgeException ove=new OverAgeException();
					System.out.println(ove.getMessage(name));
					throw ove;
				}
			}
}
