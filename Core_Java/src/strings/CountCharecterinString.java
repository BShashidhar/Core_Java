package strings;

import java.util.Scanner;

public class CountCharecterinString {
	public static void countChar(String str) {
		char[] chr=str.toCharArray();
		char[] tchr=new char[chr.length];
		int count=1,len=0;
		for (int i = 0; i < chr.length; i++) {
			for (int j = i+1; j < chr.length; j++) {
				if (chr[i]==chr[j]) {
					count++;
				}
			}
			int temp=0;
			for (int k = 0; k < len; k++) {
				if (tchr[k]==chr[i])
				{
					temp++;
				}
			}
			if (temp==0) {
				System.out.println(chr[i]+" is "+count+" times...");
				tchr[len++]=chr[i];
			}
			count=1;
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		countChar(str);
		sc.close();
	}	
}
