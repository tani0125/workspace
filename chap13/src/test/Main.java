package test;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(100);

		Wand wand = new Wand();
		wand.setName("炎の杖");
		wand.setPower(80);

		Wizard w = new Wizard(wand);
		w.setHp(50);
		w.setMp(50);
		w.setName("スガワラ");

	}

}
