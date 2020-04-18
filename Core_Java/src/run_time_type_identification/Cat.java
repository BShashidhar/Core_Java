package run_time_type_identification;

public class Cat extends Animal {
	public void meow() {
		System.out.println("cat will meow");
	}

	@Override
	public void eat() {
		System.out.println("cat is eating");
	}
}
