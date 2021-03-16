package practice;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		練習問題①
		変数を１つだけ使って、コンソールに「1～10」までの数字を表示させてください。
		 */
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}

		/*
		練習問題②
		コンソールに「明日はお休み☆」と２０回表示してください。
		ただし、PG内にSystem.out.printlnは１度しか書いてはいけません。
		 */
		int count = 1;
		while(count <= 20) {
			System.out.println("明日はお休み☆");
			count++;
		}

		/*
		練習問題③-1
		以下のように、コンソールに出力を行ってください。
		ただし、PG内にSystem.out.printlnは１度しか書いてはいけません。
		↓表示内容↓
		1月の給料日：\50000
		2月の給料日：\100000
		3月の給料日：\150000
		4月の給料日：\200000
		5月の給料日：\250000

		 */
		int salary = 50000;
		int month = 1;
		while(month <= 5) {

			System.out.println(month + "月の給料日：\\" + salary);
			month++;
			salary += 50000;


		}

		/*
		練習問題③-2
		以下のように、コンソールに出力を行ってください。
		ただし、PG内にSystem.out.printlnは１度しか書いてはいけません。
		↓表示内容↓
		4月の給料日：\200000
		5月の給料日：\250000
		6月の給料日：\300000
		7月の給料日：\350000
		8月の給料日：\400000

		int salary3 = 200000;
		int month3 = 4;
		while(month3 <= 8) {
			System.out.println(month3 + "月の給料日：\\" + salary2);
			month3++;
			salary3 += 50000;
		}
		 */

		/*
		練習問題④
		以下のように、コンソールに出力を行ってください。
		ただし、PG内にSystem.out.printlnは2度しか書いてはいけません。
		↓表示内容↓
		4月の給料日：\200000
		5月の給料日：\250000
		6月の給料日：\0(やってもうた;)
		7月の給料日：\50000
		8月の給料日：\100000
		 */
		int salary2 = 200000;
		int month2 = 4;
		while(month2 <= 8) {


			if(month2 == 6) {
				salary2 = 0;
				System.out.println(month2 + "月の給料日：\\" + salary2 + "(やってもうた;)");

			}else {
				System.out.println(month2 + "月の給料日：\\" + salary2);
			}
			month2++;
			salary2 += 50000;

		}

		/*
		練習問題⑤
		さいころゲームを作ります。
		さいころを2つ振って、大きい目の出たさいころを勝ちとします。
		ゲーム結果として、画面に以下のように表示するPGを書きなさい。
		↓表示内容↓
		〇と△は、〇のほうが大きいので、〇の勝ち
		※〇と△が等しい場合は「引き分け」と表示する。
		 */

		int saikoro1 = new java.util.Random().nextInt(6);
		int saikoro2  = new java.util.Random().nextInt(6);
		saikoro1++;
		saikoro2++;
		if(saikoro1 == saikoro2) {
			System.out.println(saikoro1 + "と" + saikoro2 + "は、" + "等しいので引き分け");
		}else {
			int answer = Math.max(saikoro1, saikoro2);
			System.out.println(saikoro1 + "と" + saikoro2 + "は、" + answer + "のほうが大きいので、" + answer + "の勝ち");
		}

		/*
		練習問題⑥
		数当てゲームを行います。
		サイコロを振って出た目が、コンソールに入力する1桁の値と等しければ「ビンゴ」と表示させてください。
		等しくなければ「はずれ;」と表示させてください。
		*/
		System.out.println("1～6の中から数字を1つ入力してください");
		int number = new java.util.Scanner(System.in).nextInt();
		int answer = new java.util.Random().nextInt(6);
		answer++;
		System.out.println("答えは" + answer);
		if(number == answer) {
			System.out.println("ビンゴ！");
		}else {
			System.out.println("はずれ;");
		}

		/*
		練習問題⑦
		パスワード登録システムを開発します。
		画面に「パスワードを登録します」と表示します。
		平仮名4文字をコンソールから入力し、パスワードとします。
		次に、画面に「パスワードの確認をします」と表示します。
		再度平仮名4文字の入力をコンソールから行います。
		パスワードが一致していれば「登録しました」と表示します。
		パスワードが一致しなければ「パスワードが異なります」と表示します。
		 */
		System.out.println("パスワードを登録します");
		String password = new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードの確認をします");
		String password2 = new java.util.Scanner(System.in).nextLine();

		if(password.equals(password2)) {
			System.out.println("パスワードを登録しました");
		}else {
			System.out.println("パスワードが異なります");
		}

	}

}
