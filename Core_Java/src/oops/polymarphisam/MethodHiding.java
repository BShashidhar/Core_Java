package oops.polymarphisam;

class Parent {
	public static void ByeTv() {
		System.out.println("Parent Bye 1990 model TV");
	}
}

class Child extends Parent {
	public static void ByeTv() {
		System.out.println("child Bye 1990 model TV");
	}
}


public class MethodHiding {

	public static void main(String[] args) {
		P p = new P();
		p.ByeTv();
		
		P p1=new C();
		p1.ByeTv();
		
		C c=new C();
		c.ByeTv();
		
//		C c1=new P();
//		c1.ByeTv();    // CE
	}

}
