package test02;

public abstract class TangibleAsset extends Asset {

	/*
	 練習問題11-2
	 (ア)Asset
	 (イ)IntangibleAsset
	 (ウ)Patent
	 */

	String color;

	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
