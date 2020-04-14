package patterns;

public class pattern09 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i * 2 - 1 && j % 2 != 0)
					System.out.print(j);
				else if( j % 2 == 0)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
