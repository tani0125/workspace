package code03_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 3; i++) {
			System.out.print("現在" +  (i + 1) + "周目→");
		}

		//ループ変数を1からスタートする
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		//ループ変数を2ずつ増やす
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}

		//ループ変数を10から1ずつ1まで減らしていく
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		//ループ変数を初期化しない
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}

		//繰り返し時の処理を行わない
		for(i = 0; i < 10;) {
			i++;
			System.out.println(i);
		}
	}

}
