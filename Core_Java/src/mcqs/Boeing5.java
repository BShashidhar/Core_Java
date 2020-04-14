package mcqs;

import java.util.HashMap;
import java.util.Map;

public class Boeing5 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "ONE");
		map.put(2,"two");
		map.put(1,"one");
		map.put(null,"ONE");
		map.put(null, "null");
		System.out.println(map.size());
	}

}
