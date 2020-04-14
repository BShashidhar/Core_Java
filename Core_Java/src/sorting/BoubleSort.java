package sorting;

public class BoubleSort {
	public static void main(String[] args) {
		int[] arr= {2,1,2,3,4,6};
		int i,j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}				
			}	
			System.out.print(arr[i]+" ");
		}
	}
}
