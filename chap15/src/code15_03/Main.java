package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4～8行目は" + s1.substring(3,8));

		String s2 = "JAVA";
		String s3 = "java";
		String s4 = " Java ";
		String s5 = "あいうえお";
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.trim());
		System.out.println(s5.replace("あい", "かき"));

	}

}
