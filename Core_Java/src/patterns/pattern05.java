package patterns;

public class pattern05 {
	public static void main(String[] args) {
		int n=5,i,j,k;
		for (i = 0; i <= n; i++) {
			k=1;
			for (j = 0; j <= n+4; j++) {
				if((j>=n+1-i) && (j<=n-1+i)) {
					System.out.print(j);
					k=0;	
				}					
				else {
					System.out.print("");
					k=1;
				}					
			}
		}
		System.out.println();
	}

}
