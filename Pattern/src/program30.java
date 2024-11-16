import java.util.Scanner;

public class program30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row:");
		int row=sc.nextInt();
		System.out.println("Enter column:");
		int col=sc.nextInt();
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
