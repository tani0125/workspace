package test;

public class Car {
	int fuel;
	int speed;

	public void accelarate(int accel) {
		this.speed += accel;
		System.out.println(accel + "キロ加速しました。");
	}

	public int run(int hour) {
		int kyori = hour * this.speed;
		this.fuel -= kyori;
		return kyori;
	}

	public void stop() {
		this.speed = 0;
		System.out.println("停止しました。");
	}

	public void showMeter() {
		System.out.println("現在の燃料は、" + this.fuel);
		System.out.println("現在の時速は、" + this.speed);
	}
}
