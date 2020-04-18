package list;

import java.util.*;;

public class Student implements Comparable<Student> {
	private int studentId, age;

	public Student(int studentId, int age) {

		this.studentId = studentId;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", age=" + age + "]";
	}

	public int compareTo(Student st) {
		if (getAge() == st.getAge()) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else
			return -1;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			if (getAge() == st.getAge()) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

}
