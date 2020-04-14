package oops.interfaces;

public interface p1 {
	void show();
	default void display() {
		System.out.println("p1 display...");
	}
	static void see() {
		System.out.println("p1 see");
	}
}
