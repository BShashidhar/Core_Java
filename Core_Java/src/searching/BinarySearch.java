package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 6, 8, 9 };
		int target = 3;
		int low = 0, mid = 0, high = arr.length-1;
		while (low <= high) {
			if (arr[mid] == target) {
				System.out.println("element found at position..." + mid);
				break;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (arr[mid]!=target) {
			System.out.println("element not found...");
		}
	}

}
