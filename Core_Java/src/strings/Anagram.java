package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1=sc.next();
		System.out.println("Enter 2st string");
		String str2=sc.next();
		isAnogram(str1,str2);
		sc.close();
	}

	public static void isAnogram(String str1,String str2) {
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		boolean status=true;
		if (s1.length()!=s2.length()) {
			status=true;
		}
		else {
			char[] chr1=s1.toLowerCase().toCharArray();
			char[] chr2=s2.toLowerCase().toCharArray();
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			status=Arrays.equals(chr1, chr2);
		}
		if (status) 
			System.out.println(s1+" and "+s2+" both "+"are annogram to each other");		
		else
			System.out.println(s1+" and "+s2+" both "+"are not annagram to each other");		
	}

}
