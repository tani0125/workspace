package test;

public class Main {

	public static void main(String[] args) {

		//練習10-03
		Hero h = new Hero();

		Matango m = new Matango('A');
		m.attack(h);

		PoisonMatango pm = new PoisonMatango('B');
		pm.attack(h);

	}

}
