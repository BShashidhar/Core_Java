package interviewPre;
public class VandCInString {
	public static void main(String[] args) {
		String str = "Shashidhar Besta";
		char chr[] = str.toCharArray();
		int vcount = 0, ccount = 0;
		for (int i = 0; i < chr.length; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vcount++;
			else if ((ch >= 'a' && ch <= 'z'))
				ccount++;
		}
		System.out.println("vowels:" + vcount + "\n" + "consonents:" + ccount);
	}
}
