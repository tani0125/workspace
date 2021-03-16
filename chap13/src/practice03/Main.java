package practice03;

public class Main {

	public static void main(String[] args) {

		Hamburger cheese = new Hamburger();
		String hamburger = "チーズバーガー";
		int calorie = 450;
		int price = 700;
		cheese.setHamburger(hamburger);
		cheese.setCalorie(calorie);
		cheese.setPrice(price);

		Hamburger lettuce = new Hamburger();
		String hamburger2 = "レタスバーガー";
		int calorie2 = 350;
		int price2 = 700;
		lettuce.setHamburger(hamburger2);
		lettuce.setCalorie(calorie2);
		lettuce.setPrice(price2);

		System.out.println(cheese.getHamburger() + "と" + lettuce.getHamburger() + "のカロリーの合計は" + (cheese.getCalorie() + lettuce.getCalorie()));

	}

}
