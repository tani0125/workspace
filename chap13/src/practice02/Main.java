package practice02;


public class Main {

	public static void main(String[] args) {

		double bottom = 7;
		double height = 5;
		Triangle t = new Triangle(bottom, height);
		System.out.println("三角形の面積は" + t.area());

	}

}
