package recursion;

import java.util.Scanner;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number...");
		int num=sc.nextInt();		
		System.out.println(sum(num));
	}

	public static int sum(int num) {
			return num==0?0:num%10+sum(num/10);
	}
}
