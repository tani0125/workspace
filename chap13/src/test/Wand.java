package test;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() < 3) {
			throw new IllegalArgumentException("名前が3文字未満である。処理を中断。");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if(power < 0.5) {
			throw new IllegalArgumentException("パワーが少ないです。処理を中断。");
		}
		if(power > 100) {
			throw new IllegalArgumentException("パワーが多いです。処理を中断。");
		}
		this.power = power;
	}
}
