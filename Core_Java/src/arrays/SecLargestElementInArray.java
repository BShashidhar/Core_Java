package arrays;

public class SecLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 100, 99 };
		int large = arr[0];
		int seclrg = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = seclrg;
				seclrg = arr[i];
			}
		}
		System.out.println(seclrg);
	}
}