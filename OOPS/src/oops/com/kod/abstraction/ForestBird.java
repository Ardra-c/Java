package oops.com.kod.abstraction;

public  class ForestBird {
		void acceptBird(Bird ref) {
			ref.eat();
			ref.sleep();
			ref.fly();
		}
		
		void acceptEagle(Eagle ref) {
			ref.eat();
			ref.sleep();
			ref.fly();
			ref.foodHabit();
		}
		//creating method  for common behaviour 
		void acceptSparrow(Sparrow ref) {
			ref.eat();
			ref.sleep();
			ref.fly();
			ref.eatHabit();
		}
}
