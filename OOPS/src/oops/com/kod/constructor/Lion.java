package oops.com.kod.constructor;

public class Lion extends Animal{
		String name = "Rani";
		@Override
		void eat() {
		super.eat();
		System.out.println("Meat");
		}
		
		void displayName() {
			System.out.println(super.name);
			System.out.println(name);
		}
}
