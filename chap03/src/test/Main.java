package test;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習3－1
		int weight = 65;
		if(weight == 60) {

		}

		double age1 = 10;
		double age2 = 5;
		if((age1 + age2) * 2 > 60) {

		}

		int age = 3;
		if(age % 2 == 1) {

		}

		String name = "湊";
		if(name.equals("湊")) {

		}

		//練習3－2
		//条件式として適切なものは、CDE;

		//練習3－3
		int isHungry = 1;
		String food = "チョコレート";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

		//練習3－4
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}

		/*
		 else後の{}は、else内が複数行ある場合は省略できない。
		 {}をつけないとtrueの場合もfalseの場合も「寝ます」が表示されてしまう。
		 */

		//3-5
		System.out.print("[メニュー]1：検索2：登録3：削除4：変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}

		//3-6
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0;i < 5; i++) {
			System.out.println("0～9までの数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
