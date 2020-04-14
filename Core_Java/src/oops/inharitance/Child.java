package oops.inharitance;

public class Child extends Parent{	
	public void Cash() {
		System.out.println("C Cash Method...");
	}
	public void Land() {
		System.out.println("C Land Method...");
	}
	public void Gold() {
		System.out.println("C Gold Method...");

	}
	public static void main(String[] args) {
		Child c=new Child();
		c.Cash();
		c.Gold();
		c.Land();	
		Parent p=new Parent();
		p.Cash();
		p.Gold();
		p.Land();
		Parent p1=new Child();
		p1.Cash();
		p1.Gold();
		p1.Land();
//		Child c1=new Parent(); conversion problam
	}
}
