package interviewPre;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String str1="sam";
		String str2="amm";
		boolean status=true;
		if (str1.length()!=str2.length()) {
			 status=false;
		}
		char chr1[]=str1.toLowerCase().toCharArray();
		char chr2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		status=Arrays.equals(chr1, chr2);
		if (status) {
			System.out.println(str1+" "+str2+" "+"Both are Annagrams...");
		}
		else
			System.out.println(str1+" "+str2+" "+"Both are not an Annagrams...");
	}
}
