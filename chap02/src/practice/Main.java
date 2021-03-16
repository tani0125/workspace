package practice;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		練習問題①
		三角形の面積を計算し、計算結果を出力するPGを書きなさい。
		ただし、変数を使用して計算を行うこと。
		 */
		double bottom = 7;
		double height = 5;
		double area = bottom * height / 2;
		System.out.println("底辺" + bottom + "高さ" + height + "の三角形の面積は" + area);

		/*
		練習問題②
		所持金20,000円のサネヨシが、1本3,500円するワインを購入します。
		何本の購入が可能か？
		所持金は何円余るか？
		出力するPGを書きなさい。
		 */
		int money = 20000;
		int price = 3500;
		int answer = money / price;
		int answer2 = money % price;
		System.out.println(answer + "本のワインが購入可能で、所持金は" + answer2 + "円余る。");
	}

}
