package practice;

public class Main {
	/*
	練習問題①
	長方形の面積を計算する「chouhoukeiArea()」を定義。
	同メソッド内で任意の縦・横の値を決め、面積を出力しなさい。
	 */
	public static void main(String[] args) {
		chouhoukeiArea();
	}

	public static void chouhoukeiArea() {
		double tate = 7.0;
		double yoko = 5.0;
		double answer = tate * yoko;
		System.out.println("長方形の面積は" + answer);
	}

}
