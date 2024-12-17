package com.kod.dsa.collections.generics;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1=new Employee("Ardra",11,20000);
		al.add(e1);
		al.add(new Employee("Marshi",12,230000));
		al.add(new Employee("Hasna",13,250000));
		al.add(new Employee("Nida",14,280000));
		System.out.println(al);
	}

}
