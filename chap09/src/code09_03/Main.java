package code09_03;

public class Main {

	public static void main(String[] args) {

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();

		Sword s2 = new Sword();
		s2.name = "氷の剣";
		s2.damage = 15;
		h.sword = s2;
		h.attack();

	}

}
