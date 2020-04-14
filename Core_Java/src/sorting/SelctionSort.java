package sorting;

public class SelctionSort {
	public static void main(String[] args) {
		int arr[]= {64,25,12,22,11};
		int len=arr.length;
		for (int i = 0; i < len-1; i++) {
			int min_index=i;
			for (int j = i+1; j < len; j++) {
				if (arr[j]<arr[min_index]) 
					min_index=j;								
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;			
		}
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]+" ");			
		}
	}
}
