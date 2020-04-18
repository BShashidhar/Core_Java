package aggregation;

/**
 * @author B Shashidhar
 *
 * 
 */
public class Student {
	private int rollno;
	private Address address;

	public Student(int rollno, Address address) {
		super();
		this.rollno = rollno;
		this.address = address;
	}

	public void f1(Address ad) {
		address = ad;
		System.out.println(address.city + "\t" + address.streetNum);
	}

	public static void main(String args[]) {
		Address adr = new Address(101, "Bangalore");
		Student s = new Student(10, adr);
		s.f1(adr);
		System.out.println(s.rollno);
		System.out.println(s.address.city);
	}

}
