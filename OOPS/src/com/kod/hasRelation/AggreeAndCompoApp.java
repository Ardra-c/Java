package com.kod.hasRelation;

public class AggreeAndCompoApp {

	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student.id+" Name:"+student.name+" with Email:"+student.email);
		
		Book book = new Book();
		System.out.println("Student Brain Color "+student.brain.color);
		student.ReadBook(book);
		
		student=null;
		System.out.println("Student object destroyed");
	//	System.out.println(student.name+" "+student.brain.color);
		System.out.println(book.author+" "+book.cost);
	}

}
 