package oops.com.kod.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setName("Ardra");
		System.out.println(stu.getName());
		
		stu.setage(22);
		System.out.println(stu.getage());
		
		stu.setgender("Female");
		System.out.println(stu.getgender());
		
		System.out.println("==================");
		stu.eat();
		stu.sleep();
		stu.study();
	}

}
