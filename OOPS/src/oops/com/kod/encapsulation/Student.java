package oops.com.kod.encapsulation;

public class Student {
		private String name;
		private int age;
		private String gender;
		
		public void setName(String name) {
			//(name!=null)
			if(name.length()>0) {
			this.name=name;
			}else {
				System.out.println("Invalid name");
			}
		}
		public String getName() {
			return name;
		}
		
		public void setage(int age) {
			if(age > 20) {
			this.age=age;
		}else {
			System.out.println("Invalid age");
		}
		}
		public int getage() {
			return age;
		}
		
		public void setgender(String gender) {
			this.gender=gender;
		}
		public String getgender() {
			return gender;
		}
		
		public void eat() {
			System.out.println(name+" student is eating");
		}
		public void sleep() {
			System.out.println(name+" student is sleeping");
		}
		public void study() {
			System.out.println(name+" student is studying");
		}
}

