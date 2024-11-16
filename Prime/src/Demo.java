import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		boolean res=prime(num);
		if(res) {
			System.out.println(res+" is prime number");
		}else {
			System.out.println(res+" is not prime number");
		}

	}
	public static boolean prime (int n) {
		if(n<=1) {
			return false;
		}
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				return false;
			}
		}return true;
	}

}
