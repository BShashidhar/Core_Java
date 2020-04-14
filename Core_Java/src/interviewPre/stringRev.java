package interviewPre;

public class stringRev {
	public static void main(String[] args) {
		String str="Shashidhar";
		char ch[]=str.toCharArray();
		for (int i = ch.length-1; i >= 0 ; i--) {
			System.out.print(ch[i]);
		}
	}
}
