import java.util.Scanner;

public class java{

	public static void main(String[] args) {
		System.out.println("================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		printRightAngledTriangleCharacterPattern n= new printRightAngledTriangleCharacterPattern();
		n.printpattern(sc.nextInt());
		System.out.println("END OF PATTERN");
		System.out.println("=================================");
	}

}
