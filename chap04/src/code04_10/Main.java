package code04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);


		//最大値を調べる
		int max = 0;
		for(int i = 0; i < scores.length; i++) {
			max = Math.max(max,scores[i]);
		}
		System.out.println("最大値は" + max);

		//最小値を調べる
		int min = 100;
		for(int i = 0; i < scores.length; i++) {
			min = Math.min(min,scores[i]);
		}
		System.out.println("最小値は" + min);


		//すべての値を掛け算した値
		int multiply = 1;
		for(int i = 0; i < scores.length; i++) {
			multiply *= scores[i];
		}
		System.out.println("すべての値を掛け算した値は、" + multiply);
	}

}
