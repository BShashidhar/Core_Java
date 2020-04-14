package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3 };
		Arrays.sort(arr);
		int[] tar = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tar[j] = arr[i];
				j++;
			}
		}
		tar[j] = arr[arr.length - 1];
		for (int i = 0; i < tar.length; i++) {
			if (tar[i]!=0) 
			System.out.print(tar[i] + " ");
		}
	}
}