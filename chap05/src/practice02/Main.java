package practice02;

public class Main {

	/*
 	練習問題②
	長方形の面積を計算する「chouhoukeiArea()」を定義。
	同メソッドから、面積を出力しなさい。
	ただし縦・横の値は、メインメソッドから渡すこと。
	*/

	public static void main(String[] args) {
		chouhoukeiArea(3.0, 4.0);
	}

	public static void chouhoukeiArea(double tate, double yoko) {
		double answer = tate * yoko;
		System.out.println("長方形の面積は" + answer);
	}

}
