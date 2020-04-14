package matrix;

public class mulMatrix {
	public static void main(String[] args) {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j]=0;
				for (int k = 0; k < b.length; k++) {
					c[i][j]+=a[i][k]*a[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}	
}
