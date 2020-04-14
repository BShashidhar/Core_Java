package collections;

import java.util.HashSet;
import java.util.Set;

public class duplicateRemoveInString {	
	
	public static String removeDuplicate(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		
		for (int i = 0; i < sb.length(); i++) {
			Character ch=str.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();	
	}	
	
	public static void main(String[] args) {
		String str="Shashidhar";
		System.out.println(removeDuplicate(str));
	}
}
