package test;

public class PoisonMatango extends Matango {

	int count = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if(count > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int attackPoint = h.hp / 5;
			h.hp -= attackPoint;
			System.out.println(attackPoint + "ポイントのダメージ！");
			this.count--;
		}
	}

}
