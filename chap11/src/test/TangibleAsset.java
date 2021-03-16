package test;

public abstract class TangibleAsset {

	String name;
	int price;
	String color;

	public TangibleAsset(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

}
