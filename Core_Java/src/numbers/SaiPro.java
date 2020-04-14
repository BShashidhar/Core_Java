package numbers;
import java.util.Scanner;
public class SaiPro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int in=sc.nextInt();
		int count=1,currentRow=1;
		for(int i=0;i<=in;i++){
			if(i%2==0){
				for(int j=0;j<=i;j++){
					System.out.print(count+" ");
					count++;
				}				
			}	
			else{				
			int rev=currentRow+count-1;
			for(int j=0;j<=i;j++){
				System.out.print(rev--+" ");
				count++;
			}
		}
		System.out.println();			
		currentRow++;			
		}	
	}
}