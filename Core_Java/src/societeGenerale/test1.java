package societeGenerale;

public class test1 {

	public static void main(String[] args) {
		String str="abcdeeffffghiijjkklmmmmmnoop";
		char[] ch=str.toCharArray();
		char[] tchar=new char[ch.length];
		int len=0,count=1;
		for (int i = 0; i < tchar.length; i++) {
			for (int j = i+1; j < tchar.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			int temp=0;
			for (int k = 0; k < len; k++) {
				if (tchar[k]==ch[i]) {
					temp++;
				}
			}
			if (temp==0) {
				System.out.print(ch[i]+""+count);
				tchar[len++]=ch[i];
			}
			count=1;
		}
	}
}
