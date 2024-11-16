package com.kod.hasRelation;

public class Student {
		String id="KOD123";
		String name="Ardra";
		String email="ar@123";
		int marks=89;
		
		Brain brain = new Brain();
		
		void ReadBook(Book ref) {
			System.out.println("Reading "+ref.author+" book with price "+ref.cost);
		}
}
