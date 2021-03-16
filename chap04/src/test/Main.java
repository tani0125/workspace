package test;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習4-1
		int[] points;
		points = new int[4];

		double[] weight;
		weight = new double[5];

		boolean[] answers;
		answers = new boolean[3];

		String[] names;
		names = new String[3];

		//練習4-2
		int moneyList[] = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		for(int value: moneyList) {
			System.out.println(value);
		}

		//練習4-3
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		//System.out.println(counts[1]);		//NullPointerException
		//System.out.println(heights[2]);		//ArrayIndexOutOfBoundsException

		//練習4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < numbers.length; i++) {
			if(input == numbers[i]) {
				System.out.println("アタリ！");
			}
		}

		//追加問題
		/*
		1.練習4-4を改良しましょう
		次の①～②を別々のプログラムとして作成しましょう。

		①numbersの初期値は0～9のランダムで3つ設定しましょう。
		ただし、同じ数字が入ってはいけません。

		②numbersの初期値は0～9のランダムで5つ設定しましょう。
		ただし、同じ数字が入ってはいけません。
		その上で2回入力を受け付け、両方あっているときには「全部アタリ！」、
		片方あっているときには「アタリ！」と表示しましょう。
		 */

		//①
		int[] numbers2 = new int[3];

		numbers2[0] = new java.util.Random().nextInt(10);
		numbers2[1] = new java.util.Random().nextInt(10);

		while(numbers[0] == numbers[1]) {
			numbers2[1] = new java.util.Random().nextInt(10);
		}

		numbers2[2] = new java.util.Random().nextInt(10);

		while(numbers[2] == numbers[1] || numbers[2] == numbers[0]) {
			numbers2[2] = new java.util.Random().nextInt(10);
		}

		/*
		for(int i = 0; i < numbers2.length; i++){
			numbers2[i] = new java.util.Random().nextInt(10);
			for(int j = 0; j < i; j++){
				while(numbers2[i] = numbers2[j]){
					numbers2[i] = new java.util.Random().nextInt(10);
				}
			}
		}
		 */


		System.out.println("1桁の数字を入力してください");
		int input2 = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < numbers2.length; i++) {
			if(input2 == numbers2[i]) {
				System.out.println("アタリ！");
			}
		}

		//②
		int[] numbers3 = new int[5];
		for(int i = 0; i < numbers3.length; i++){
			numbers3[i] = new java.util.Random().nextInt(10);
			for(int j = 0; j < i; j++){
				while(numbers3[i] == numbers3[j]){
					numbers3[i] = new java.util.Random().nextInt(10);
				}
			}
		}

		System.out.println("1桁の数字を入力してください");
		int input3 = new java.util.Scanner(System.in).nextInt();
		System.out.println("1桁の数字を入力してください");
		int input4 = new java.util.Scanner(System.in).nextInt();

		int count2 = 0;
		for(int i = 0; i < 2; i++) {
			if(input3 == numbers3[i] || input4 == numbers3[i] ) {
				count2++;
			}
		}

		if(count2 == 2) {
			System.out.println("全部アタリ！");
		}else if(count2 == 1) {
			System.out.println("アタリ！");
		}
	}

}
