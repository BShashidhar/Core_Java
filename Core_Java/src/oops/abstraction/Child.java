package oops.abstraction;
	public class Child extends Parent{
		@Override
		void A() {
			System.out.println("Abstract Class...");			
		}		
	public static void main(String[] args) {			
		Child ch=new Child();
		ch.A();
		ch.X();
		ch.Y();
	}
}


