package code15_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();

		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello");
		sb2.append("World");
		sb2.append("Of");
		sb2.append("Java");
		System.out.println(sb2.toString());
	}

}
