package code09_08;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero("ミナト");
		System.out.println(h.hp);
		System.out.println(h.name);

		Hero h2 = new Hero();
		System.out.println(h2.name);

	}

}
