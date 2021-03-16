package test03;

public abstract class TangibleAsset extends Asset implements Thing {

	String color;
	double weight;

	public TangibleAsset(String name, int price, String color, double weight) {
		super(name, price);
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}



}
