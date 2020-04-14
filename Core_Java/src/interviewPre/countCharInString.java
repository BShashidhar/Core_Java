package interviewPre;

public class countCharInString {
	public static void main(String[] args) {
		String str= "Shashidhar Besta";
		char ch[]=str.toCharArray();
		char tch[]=new char[ch.length];
		int count=1,len=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j])
				{
					count++;
				}
			}
			int temp=0;
			for (int k = 0; k < len; k++) {
				if (tch[k]==ch[i]) {
					temp++;
				}					
			}
			if (temp==0) {
				System.out.println(ch[i]+" is "+count+" times");
				tch[len++]=ch[i];
			}
			count=1;	
		}			
	}
}
