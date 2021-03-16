package code03_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j); //掛け算の結果を出力
				System.out.print(" "); //空白を出力
			}

			System.out.println(""); //改行を出力
		}

		//break文とcontinue文
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
