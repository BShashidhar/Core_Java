package interviewPre;
import java.util.Scanner;

public class primeNoOnetoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			} else {
				count=0;
			}
		}
		sc.close();
	}
}
