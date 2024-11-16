package app.kod.com;

public class staticmethods {
		static int a;
		static int b;
		static int c;
		static {
			a=100;
			b=200;
			c=300;
		}
		public static void display1() {
			System.out.println(a+" "+b+" "+c);
		}
		int x;
		int y;
		int z;
		{
			x=500;
			y=600;
			z=700;
			a=800;
			b=900;
			c=1000;
		}
		void display2() {
			System.out.println(x+" "+y+" "+z);
			System.out.println(a+" "+b+" "+c);
		}
}
