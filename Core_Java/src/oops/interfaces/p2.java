package oops.interfaces;

public interface p2 {
	void show();
	default void display() {
		System.out.println("p2 display...");
	}
	static void see() {
		System.out.println("p2 see");
	}
}
