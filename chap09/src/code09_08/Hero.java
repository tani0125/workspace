package code09_08;

public class Hero {
	String name;
	int hp;

	public void attack() {

	}

	public Hero(String name) {
		this.hp = 100;		//hpフィールドを100で初期化
		this.name = name;
	}

	public Hero() {
		this("ダミー");
	}
}
