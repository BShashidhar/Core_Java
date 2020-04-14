package patterns;

public class pattern02 {

	public static void main(String[] args) {
		int n=5,row,col;
		for (row = 1; row <= n; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		for (row = n; row >= 0; row--) {
			for (col = 1; col <= row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
