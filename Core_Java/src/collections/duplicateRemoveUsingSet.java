package collections;

import java.util.HashSet;
import java.util.Set;

public class duplicateRemoveUsingSet {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,2,1};
		Set<Integer> hs=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (Integer a:hs) {
			System.out.println(a);
		}
	}
}
