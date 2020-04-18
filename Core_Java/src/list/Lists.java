package list;

import java.util.*;
import java.io.*;

public class Lists {
	public static void main(String[] args) {
//		List<String> L=new ArrayList<>();
//		L.add("Suresh");
//		L.add("naresh");
//		L.add("mahesh");
//		/*Iterator itr=L.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}*/
//		for(String s:L)
//		{
//			System.out.println(s);
//		}
//		int pos=1;
//		L.remove(pos);
//		System.out.println(L);
//		Object toFind="mahesh";
//		int pos1=L.indexOf(toFind);
//		if(pos1>=0)
//		{
//			System.out.println("found at  " +pos);
//		}
//		else
//		{
//			System.out.println("not found");
//		}
		List<Student> l = new ArrayList<>();
		l.add(new Student(101, 23));
		l.add(new Student(1981, 278));
		l.add(new Student(1214, 29));
		l.add(new Student(108, 21));
		// Collections.sort(l);
//		int pos=1;
//		Student stud=l.get(pos);
//		stud.setAge(18);
//		System.out.println(l);
		Student toFind = new Student(101, 23);
		int pos1 = l.indexOf(toFind);
		Student stud = l.get(pos1);
		// stud.setAge(10);

		// System.out.println(l);

		int i = (int) (Math.random() * 10);
		System.out.println(i);
		if (i < 5) {

			Collections.sort(l);

		} else {
			Comparator<Student> c = new SortUsingStudentId();
			Collections.sort(l, c);
		}
		for (Student s : l) {
			System.out.println(s);
		}

	}

}
