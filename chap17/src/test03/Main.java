package test03;

public class Main {

	public static void main(String[] args) {
		try {
			String s = "三";
			int result = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println("文字列の形式が正しくありません");
		}
	}

}
