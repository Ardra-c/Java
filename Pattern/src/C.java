
public class C {

	public void last() {
		int n=11;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<n-1)||j==0||i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}