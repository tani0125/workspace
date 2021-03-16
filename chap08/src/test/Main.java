package test;

public class Main {

	public static void main(String[] args) {
		//インスタンスを生成
		Car c = new Car();

		//フィールドの指定
		c.fuel = 250;
		c.speed = 40;

		//メソッドの呼び出し
		int kyori = c.run(5);
		System.out.println(kyori + "km走りました。");
		System.out.println(c.run(5) + "km走りました。");
		c.accelarate(40);
		c.showMeter();
		c.stop();
		c.showMeter();

	}

}
