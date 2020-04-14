package arrays;

import java.util.Arrays;

public class removeElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };		
		System.out.println("original Array : "+Arrays.toString(arr));
		int tarr[] =new int[arr.length-1];
		int index=4;
		for (int i = 0,j=0; i < arr.length; i++) {
			if (i==index) {
				continue;
			}
			tarr[j++]=arr[i];
		}		
		System.out.println("after removing an element: "+Arrays.toString(tarr));
	}
}
