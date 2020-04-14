package mcqs;
import java.util.Scanner;

public class ActiveAI_Program {
	public static boolean isSupersticies(int i) {
		String str = String.valueOf(i);
		char chr[] = str.toCharArray();
		for (int j = 0; j < chr.length-1; j++) {
			if (chr[i]=='8' && chr[i+1]=='9') {
				return true;
			}
		}		
		return false;
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();	
		if(i%3==0 && i%6!=0 && i>0 && i<32767 && !isSupersticies(i)) {
			System.out.println("{");
			System.out.println("\t"+"\"number\""+":"+i);
			System.out.println("\t"+"\"isSupersticies\""+":"+true);
			System.out.println("}");
		}
		else
		{	
			System.out.println("{");
			System.out.println("\t"+"\"number\""+":"+i);
			System.out.println("\t"+"\"isSupersticies\""+":"+false);
			System.out.println("}");		
		}
		sc.close();
	}	
}
