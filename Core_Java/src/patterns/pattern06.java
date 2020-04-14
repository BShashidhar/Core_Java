package patterns;

public class pattern06 {

	public static void main(String[] args) {
		int r=5,c=9;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j<=r+1-i||j>=r-1+i) 
					System.out.print(j);
				else
					System.out.print(" ");					
			}
			System.out.println();
		}
	}
}
