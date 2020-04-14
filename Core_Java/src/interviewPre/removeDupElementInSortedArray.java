package interviewPre;

public class removeDupElementInSortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5 };
		int tarr[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tarr[j] = arr[i];
				j++;
			}
		}
		tarr[j] = arr[arr.length - 1];
		for (int i = 0; i < tarr.length; i++) {
			if (tarr[i] != 0)
				System.out.print(tarr[i] + " ");
		}
	}
}
