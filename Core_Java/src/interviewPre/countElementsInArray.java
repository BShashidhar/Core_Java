package interviewPre;

public class countElementsInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,1,4,5,6};
		int tarr[]=new int[arr.length];
		int count=1,len = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			int temp=0;
			for (int k = 0; k < len; k++) {
				if (tarr[k]==arr[i]) 
				temp++;
			}
			if (temp==0) {
				System.out.println(arr[i]+" is "+count+"times");
				tarr[len++]=arr[i];
			}
			count=1;
		}
	}
}
