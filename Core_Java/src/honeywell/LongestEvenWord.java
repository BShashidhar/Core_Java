package honeywell;

import java.util.Scanner;

public class LongestEvenWord {
	public static String printLongestEvenWord(String sentence) {
		String[] words = sentence.split(" ");
		int i = 0, len = -1;
		String result = new String();
		for (String word : words) {
			if (word.length() % 2 == 0) {
				i = word.length();
				if (len < i) {
					len = i;
					result = word;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a long string...");
		String sentence = sc.nextLine();
		System.out.println(printLongestEvenWord(sentence));
		sc.close();
	}
}
