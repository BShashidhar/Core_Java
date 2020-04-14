package interviewPre;

import java.util.HashSet;
import java.util.Set;

public class removeDupElementInUnSortedArray {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,1,4,6};
		Set<Integer> hs=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);			
		}
		System.out.println(hs);
	}
}
