package interviewPre;

public class bsort {
	public static void main(String[] args) {
		int arr[]= {1,4,2,1,5,6,3};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(arr[i]+" ");
		}
	}

}
