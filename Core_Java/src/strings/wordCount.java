package strings;

public class wordCount {

	public static void main(String[] args) {
		String str = "Hello, world world Hello, Hello, Hello".replaceAll("\\,","");
		String[] words = str.split(" ");
		int count = 1; // Variable for getting Repeated word count
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0"; // Replace repeated words by zero
				}
			}
			if (words[i] != "0")
				System.out.println(words[i] + " is " + count);
			count = 1;
		}
	}
}
