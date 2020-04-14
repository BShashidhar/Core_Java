package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNo {
	public static void main(String[] args) {
		String s = "919494879694";
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		if (m.find() && m.group().equals(s)) {
			System.out.println("valid Mobile no...");
		} else {
			System.out.println("invalid Mobile no...");
		}
	}
}
