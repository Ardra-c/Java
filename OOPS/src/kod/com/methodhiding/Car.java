package kod.com.methodhiding;

public class Car extends Vehicle {
		String name="Lambo";
		@Override
		void start() {
			System.out.println(name+" Vehicle is started");
		}
		static void drive() {
			System.out.println("Lambo Vehicle is driven");
		}
		@Override
		void stop() {
			System.out.println(name+" Vehicle stops");
		}
}
