import java.util.Scanner;

public class practisce {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}