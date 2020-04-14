package oops.interfaces;

public class c1 implements p1,p2 {

	@Override
	public void show() {
		System.out.println("child..");		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		p1.super.display();
		p2.super.display();
	}
	public static void main(String[] args) {
		c1 c=new c1();
		c.display();
		c.show();
		p1.see();
		p2.see();
	}

}
