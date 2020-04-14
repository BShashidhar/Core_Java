package strings;
import java.util.Scanner;

public class Today {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input1=sc.nextInt();
		int sum=0;
		for (int i = 1; i < Math.sqrt(input1); i++) {
			if (input1%2==0) {
				if (i==(input1+1)) 
					sum=sum+i;
					else
					sum=sum+(i+input1/i);					
			}
			System.out.println(sum);
		}
	}

}
