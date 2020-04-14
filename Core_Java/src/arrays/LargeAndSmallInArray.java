package arrays;

public class LargeAndSmallInArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,100};
		int small=arr[0];
		int large=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<small)
			{
				small=arr[i];
			}
			else if(arr[i]>large) {
				large=arr[i];
			}			
		}
		System.out.println(small+" "+large);
	}
}