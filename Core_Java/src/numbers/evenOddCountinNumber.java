package numbers;

import java.util.Scanner;

public class evenOddCountinNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number...");
		int num=sc.nextInt();
		int evenCount=0,oddCount=0;
		int rem;
		while (num>0) {
			rem=num%10;
			if (rem%2==0) 
				evenCount++;
			else
				oddCount++;
			num/=10;
		}
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
	}

}
