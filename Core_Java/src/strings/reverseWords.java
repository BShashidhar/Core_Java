package strings;

public class reverseWords {
	public static void main(String[] args) {
		String[] str="Hello World".split(" ");
		String ans= " ";
		for (int i = str.length-1;i >= 0; i--) {
			ans +=str[i]+" ";
		}
		System.out.println(ans.substring(0,ans.length()-1));
	}
}
