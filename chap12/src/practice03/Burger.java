package practice03;

public abstract class Burger {

	/*
	 本日の練習問題③

	「チーズバーガー、てりやきバーガー、ライスバーガー」には、それぞれ「カロリー」があります。
	これらのカロリーの合計を、1度のメソッド実行で行って下さい。
	ただし、全てのフィールドはprivateで修飾する事。
	 */

	private double calorie;

	public Burger(double calorie) {
		this.calorie = calorie;
	}

	public double getCalorie() {
		return this.calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

}
