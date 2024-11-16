package oops.com.kod.constructor;

public class WorkerApp {

	public static void main(String[] args) {
		Worker w=new Worker(150000);
		System.out.println(w.name+" "+w.age+" "+w.salary+" "+w.rating);

	}

}
