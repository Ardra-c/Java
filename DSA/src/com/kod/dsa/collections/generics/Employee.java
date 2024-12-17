package com.kod.dsa.collections.generics;

public class Employee {
		String name;
		int id;
		double salary;
		public Employee(String name, int id, double salary) {
			super();
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
		@Override
		public String toString() {
			String message="Name = "+name+"|Id="+id+"|Salary="+salary;
			return message;
		}
		
}
