package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		String email="shashi.2346@gmail.com";
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.]a-zA-Z0-9+)+");
		Matcher m=p.matcher(email);
		if (m.find()&&m.group().equals(email)) {
			System.out.println("valid...");
		}
		else {
			System.out.println("not Valid...");
		}

	}

}
