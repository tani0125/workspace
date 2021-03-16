package code10_01;

public class Main {

	public static void main(String[] args) {

		SuperHero sh = new SuperHero();
		sh.run();
		sh.fly();

		Matango m = new Matango();
		sh.attack(m);

	}

}
