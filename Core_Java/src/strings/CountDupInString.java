package strings;

public class CountDupInString {

	public static void main(String[] args) {
		String[] str= {"hello","world","hello","hello","hello","hello","chello","chello"};
		String[] tstr=new String[str.length];
		int len=0,count=1;
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i]==str[j]) {
					count++;
				}
			}
			int temp=0;
			for (int k = 0; k < len; k++) {
				if (tstr[k]==str[i]) {
					temp++;
				}
			}
			if (temp==0) {
				System.out.println(str[i]+" "+count);
				tstr[len++]=str[i];
			}	
			count=1;
		}		
	}
}
