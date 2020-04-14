package interviewPre;

public class minandmaxArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,8};
		int min=arr[0];
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]+" ");
			if (arr[i]<min) 
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}		
		System.out.println(min+" "+max);
	}
}
