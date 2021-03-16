package test03;

public class Main {

	//練習5-3
	public static void main(String[] args) {
		String address = "aaa@bbb.com";
		String title = "タイトル";
		String text = "本文";
		email(title, address, text);
		email(address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

}
