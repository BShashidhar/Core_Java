package list;

import java.util.Comparator;

public class SortUsingStudentId implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getStudentId() == s2.getStudentId()) {
			return 0;
		} else if (s1.getStudentId() > s2.getStudentId()) {
			return 1;
		} else
			return -1;
	}

}
