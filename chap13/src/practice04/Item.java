package practice04;

public class Item {

	private String item;
	private int price;

	public Item(String item, int price) {
		this.item = item;
	}

	public String getItem() {
		return this.item;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
