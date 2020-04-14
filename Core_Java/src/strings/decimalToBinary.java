package strings;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number...");
		int num=sc.nextInt();
		String bin="";
		int count=0;
		while (num>0) {
			int rem=num%2;
			if (rem==1) {
				count++;
			}
			bin=rem+bin;
			num/=2;
		}
		System.out.println(count);
		System.out.println(bin);		
	}
}
