
public class program38 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==j||j==1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		for(int k=4;k>=i;k--) {
			if(k==4||k==i) {
			System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}

}
