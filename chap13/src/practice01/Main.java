package practice01;

public class Main {

	public static void main(String[] args) {

		double bottom = 7;
		double height = 5;
		Triangle t = new Triangle(bottom, height);
		double area = t.bottom * t.height / 2;
		System.out.println("三角形の面積は" + area);

	}

}
