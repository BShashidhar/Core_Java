package strings;

import java.util.Scanner;

public class ReverseString {
	public static void stringRev(String str) {
		char[] chr=str.toCharArray();
		int len=chr.length;
		for (int i = len-1; i >= 0; i--) {
			System.out.print(chr[i]);
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		stringRev(str);
		sc.close();

	}
}
