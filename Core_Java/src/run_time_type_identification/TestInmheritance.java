package run_time_type_identification;

public class TestInmheritance {
	public static void main(String[] args) {
		Animal anim = new Dog();
		anim.eat();
		if (anim instanceof Dog) {
			Dog d = (Dog) anim;
			d.bark();
		} else if (anim instanceof Cat) {
			Cat c = (Cat) anim;
			c.meow();
		}
	}
}
