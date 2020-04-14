package mcqs;

import java.util.ArrayList;
import java.util.List;

public class Boeing4 {
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("a");
		l.add(0,"b");
		l.add("c");
		l.add("d");
		l.set(0,"d");
		System.out.println(l.size());
		
	}

}
