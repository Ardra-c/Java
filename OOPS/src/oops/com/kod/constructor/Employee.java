package oops.com.kod.constructor;

public class Employee {
	String name;
	int age;
	
	public Employee() {
//		super();
		this(26);
		this.name="Omkar";
		this.age=22;
	}
	
	public Employee(String name) {
		this();
		this.name=name;
		this.age=22;
	}
	
	public Employee(int age) {
		this.name="Prahallad";
		this.age=age;
	}
	public Employee(String name, int age) {
		this("Bharawaraj");
		this.name=name;
		this.age=age;
	}
}
