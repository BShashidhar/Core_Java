package honeywell;

import java.util.Scanner;

public class CountingBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = sc.nextInt();
		int[] bin = new int[20];
		int count = 0;
		int flag = 0;
		while (num > 0) {
			bin[flag] = num % 2;
			if (bin[flag] == 1) {
				count++;
			}
			num /= 2;
			flag++;
		}
		System.out.println(count);
		for (int i = flag - 1; i >= 0; i--) {
			if (bin[i] == 1) {
				System.out.println(flag - i);
			}
		}
		sc.close();
	}
}
