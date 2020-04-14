package searching;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4, 5, 7, 6, 8, 9 };
		int target = 10;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at the index = " + i);
				temp++;
			}
		}
		if (temp == 0)
			System.out.println("element is not found...");
	}
}
