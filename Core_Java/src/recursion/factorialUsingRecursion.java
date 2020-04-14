package recursion;

import java.util.Scanner;

public class factorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number...");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int num) {
		if (num==1) 
			return 1;
		else
			return num*factorial(num-1);
		
	}

}
