package arrays;

import java.util.Arrays;

public class DuplicateRemovelFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3, 4, 5, 6, 7, 3 };
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[count] = arr[i];
				count++;
			}
		}
		arr[count] = arr[arr.length - 1];
		for (int i = 0; i <= count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
