package simplilearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class check implements Comparable<check> {
	int roll, marks;
	String name;

	public check(String name, int roll, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public String print() {
		return (roll + " " + name);
	}

	@Override
	public int compareTo(check o) {
		if (roll < o.roll)
			return 1;
		else if (roll > o.roll)
			return -1;
		else
			return 0;
	}
}

public class Ideone {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(input.readLine());
		List<check> records = new ArrayList<check>();
		while (t > 0) {
			String a = input.readLine();
			List<String> temp = Arrays.asList(a.split(","));
			String name = temp.get(0);
			int roll = Integer.parseInt(temp.get(1).trim());
			int marks = Integer.parseInt(temp.get(2).trim());
			records.add(new check(name, roll, marks));
			t--;
		}
		Collections.sort(records);
		for (int i = 0; i < records.size(); i++) {
			System.out.println(records.get(i).print());
		}

	}

}
