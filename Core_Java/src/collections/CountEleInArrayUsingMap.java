package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountEleInArrayUsingMap {
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,2,1};
		Map<Integer, Integer> map=new HashMap<>();
		for (int a:arr) {
			if (map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}
			else {
				map.put(a,1);
			}
		}
		for (Entry<Integer, Integer> val : map.entrySet()) {
			System.out.println(val.getKey()+" "+val.getValue());
		}
	}

}
