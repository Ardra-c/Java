package oops.com.kod.Interface;

public class Welcome {

	public static void main(String[] args) {
		Greeting greeting=(name)->{
			System.out.println("Hello "+name);
		};
		greeting.greet("Ardra");
	}
	
//	Greeting greeting=new Greeting(){
//		public void greet() {
//		System.out.println("Hello "+name);
//		}
//	};
//	greeting.greet("Ardra");
//}
}


