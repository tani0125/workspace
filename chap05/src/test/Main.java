package test;

public class Main {

	//練習5-1
	public static void main(String[] args) {
		introduceOneself();
	}

	public static void introduceOneself(){
		String name = "谷 裕美子";
		int age = 26;
		double height = 156.0;
		char eto = '戌';

		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は、" + age + "歳です。");
		System.out.println("身長は、" + height + "cmです。");
		System.out.println("干支は、" + eto + "です。");
	}
}
