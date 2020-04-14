package oops.encapsulation;

public class Encapsulation {
	String Name;
	int Id;
	String Address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public static void main(String[] args) {
		Encapsulation encp=new Encapsulation();
		encp.setName("Shashidhar");
		encp.setId(2346);
		encp.setAddress("Zaheerabad");
		System.out.println("Name : "+encp.getName()+"\n"+"Id : "+encp.getId()+"\n"+"Address : "+encp.getAddress());
	}
}
