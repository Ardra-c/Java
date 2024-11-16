package oops.com.kod.Interface;


public class CasioCal implements  Calculator {
	@Override
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
		
	}

}
