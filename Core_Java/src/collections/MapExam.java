package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		m.put(4, 'd');
		Set< Map.Entry< Integer,Character> > st = m.entrySet();  
		for (Map.Entry< Integer,Character> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       }
	}
}