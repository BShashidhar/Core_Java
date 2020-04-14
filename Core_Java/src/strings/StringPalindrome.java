package strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void isPalindrome(String str) {
		String s=str;		
		String r="";
		for (int i = s.length()-1; i >= 0 ; i--) {
			r=r+s.charAt(i);
		}
		if (s.equals(r)) {
			System.out.println(str+" is aplindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		isPalindrome(str);
		sc.close();

	}
}