package test;

//import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		int point = new java.util.Random().nextInt(3);		//int point = new Random().nextInt(3);
		int mp2 = sec + point;
		if((this.mp + mp2) > this.MAX_MP) {
			mp2 = this.MAX_MP - this.mp;
			this.mp = this.MAX_MP;
		}else {
			this.mp += mp2;
		}
		return mp2;
	}
}
