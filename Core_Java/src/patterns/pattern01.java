package patterns;


public class pattern01 {

	public static void main(String[] args) {
		int n=5,i,j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
