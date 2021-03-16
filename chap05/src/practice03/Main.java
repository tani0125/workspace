package practice03;

public class Main {

	/*
 	練習問題③
	三角形の面積を計算する「sankakukeiArea()」を定義。
	また、面積を出力する「printArea()」を定義。
	メインメソッドから底辺・高さを渡し、最後はprintArea()から出力する。
	 */

	public static void main(String[] args) {
		double x = 6.0;
		double y = 7.0;
		sankakukeiArea(x, y);
	}

	public static void sankakukeiArea(double tate, double yoko) {
		double answer = (tate * yoko) / 2;
		printArea(answer);
	}

	public static void printArea(double area) {
		System.out.println("三角形の面積は" + area);
	}

}
