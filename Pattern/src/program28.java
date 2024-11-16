
public class program28 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("_ ");
			}
			for(int k=5;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=5;k>=1;k--) {
			for(int i=1;i<=k;i++) {
				System.out.print("_ ");
			}for(int j=5;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
