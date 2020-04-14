package interviewPre;

import java.util.Scanner;

public class activeAiProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no u want?");
		int inp=sc.nextInt();
		int arr[]=new int[inp];
		int i;
		if (inp>0 && inp<32767) {
			for (i = 0; i < inp; i++) {
				arr[i]=sc.nextInt();
				if (arr[i]%3==0 && arr[i]%6!=0 && !isSuperstious(inp)) 
				{
					System.out.println("{");
					System.out.println("\t"+"\"number\""+":"+arr[i]);
					System.out.println("\t"+"\"status\""+":"+"true");
					System.out.println("}");
				}					
				else 
				{
					System.out.println("{");
					System.out.println("\t"+"\"number\""+":"+arr[i]);
					System.out.println("\t"+"\"status\""+":"+"false");
					System.out.println("}");
				}
			}
		}		
	}

	public static boolean isSuperstious(int inp) {
		String s=String.valueOf(inp);
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='8' && ch[i+1]=='9') 
				return true;
		}
		return false;
	}
}
