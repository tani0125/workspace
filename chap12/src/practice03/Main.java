package practice03;

public class Main {

	public static void main(String[] args) {

		Burger[] array = new Burger[3];
		array[0] = new Cheese(750);
		array[1] = new Teriyaki(650);
		array[2] = new Rice(550);

		double total = 0;
		for(Burger b : array) {
			total += b.getCalorie();
		}
		System.out.println("合計カロリーは" + total);

	}

}
