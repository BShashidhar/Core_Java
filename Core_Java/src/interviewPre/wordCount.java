package interviewPre;

public class wordCount {

	public static void main(String[] args) {
		String str="hello, world hello".replaceAll("\\,","");
		String[] words=str.split(" ");
		int count=1;
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if (words[i]!="0")
				System.out.println(words[i]+" "+count);
			count=1;
		}		
	}
}
