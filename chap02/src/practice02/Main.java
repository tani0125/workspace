package practice02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		さいころゲームを作ります。
		さいころを2つ振って、大きいほうの目が出たさいころを勝ちとします。
		ゲーム結果として、画面に以下のように表示するPGを書きなさい。
		※〇と△は、2つのサイコロの、それぞれの目を表しています。

		↓表示内容↓
		〇と△は、〇のほうが大きいので、〇の勝ち
		↑表示内容↑
		※△のほうが大きい場合は、「〇と△は、△のほうが大きいので、△の勝ち」となる。
		 */

		int square = new java.util.Random().nextInt(6);
		int triangle  = new java.util.Random().nextInt(6);
		square++;
		triangle++;
		int answer = Math.max(square, triangle);
		System.out.println(square + "と" + triangle + "は、" + answer + "のほうが大きいので、" + answer + "の勝ち");
	}

}
