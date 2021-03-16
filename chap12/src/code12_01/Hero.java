package code12_01;

public class Hero extends Character {

	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	public void attack() {
		System.out.println("敵に5のダメージ！");
	}

}
