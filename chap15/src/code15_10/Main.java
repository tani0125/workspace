package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();

		long end = System.currentTimeMillis();
		long end1 = end - start;
		System.out.println("StringBuilderで処理にかかった時間は" + (end1) + "でした");

		start = System.currentTimeMillis();

		s = "Java";
		for(int i = 0; i < 10000; i++) {
			s = s + "Java";
		}

		end = System.currentTimeMillis();
		long end2 = end - start;
		System.out.println("+演算子で処理にかかった時間は" + (end2) + "ミリ秒でした");
		System.out.println("+演算子で処理にかかった時間はStringBuilderで処理にかかった時間の" + (end2 / end1) + "倍でした");
	}

}
