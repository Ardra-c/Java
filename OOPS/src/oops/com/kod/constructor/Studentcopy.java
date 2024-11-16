package oops.com.kod.constructor;

public class Studentcopy {
		String name;
		int age;
		String gender;
		int marks;
		
		public Studentcopy(String name,int age,String gender,int marks) {
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.marks=marks;
		}
		public Studentcopy(Studentcopy ref) {
			this.name=ref.name;
			this.age=ref.age;
			this.gender=ref.gender;
			this.marks=ref.marks;
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
