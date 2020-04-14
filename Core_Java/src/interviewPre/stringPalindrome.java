package interviewPre;

public class stringPalindrome {
	public static void main(String[] args) {
		String str = "mam";
		String rev = "";		
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Paindrome string...");
		} else {
			System.out.println("Not a Palindrome...");
		}
	}
}
