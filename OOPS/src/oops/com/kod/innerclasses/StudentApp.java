package oops.com.kod.innerclasses;

import oops.com.kod.innerclasses.Student.Address;

public class StudentApp {

	public static void main(String[] args) {
		Student stu = new Student();
		Address ad=stu.new Address(2,5,"Apollo","Banglore","karanataka","India", 56006);
		stu.setData("Omkar",25,ad);
		stu.printDetails();
	}

}
