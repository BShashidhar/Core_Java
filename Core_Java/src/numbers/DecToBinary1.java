package numbers;

public class DecToBinary1 {
	public static void main(String[] args) {
		int num = 20;
		int rem = 0, bin = 0, rev = 0;
		while (num > 0) {
			rem = num % 2;
			bin = bin * 10 + rem;
			num /= 2;
		}
		System.out.println(bin);
		while (bin > 0) {
			rem = bin % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println(rev);
	}
}
