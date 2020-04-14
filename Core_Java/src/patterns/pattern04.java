package patterns;

public class pattern04 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+4; j++) {
				if (j >= (n + 1) - i && j <= (n - 1) + i)
					System.out.print(j);
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
