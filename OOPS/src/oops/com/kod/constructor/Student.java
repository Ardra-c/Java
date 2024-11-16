package oops.com.kod.constructor;

public class Student {
	String name;
	int age;
	String gender;
	int marks;
	public Student(String name,int age,String gender,int marks) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.marks=marks;
	}
	
	void eat() {
		System.out.println(name+" student is eating");
	}
	void sleep() {
		System.out.println(name+" student is sleeping");
	}
	void study() {
		System.out.println(name+" student is Studying");
	}
}
