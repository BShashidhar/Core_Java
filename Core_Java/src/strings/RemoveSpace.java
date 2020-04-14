package strings;

public class RemoveSpace {

	public static void main(String[] args) {
		String str="Besta Shashidhar";
		System.out.println(removeSpace(str));
	}

	private static String removeSpace(String str) {
		String withOutSpace = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				withOutSpace += str.charAt(i);
		}
		return withOutSpace;
	}
}
