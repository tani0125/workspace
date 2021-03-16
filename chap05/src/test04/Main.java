package test04;

public class Main {

	//練習5-4
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double triangle = calcTriangleArea(bottom, height);
		System.out.println(String.format("三角形の面積は%.1fcm²",triangle));

		double radius = 5.0;
		double circle = calcCrircleArea(radius);
		System.out.println("円の面積は" + circle + "cm²");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}

	public static double calcCrircleArea(double radius) {
		//double circle = radius * radius * 3.14;
		double circle = Math.PI * Math.pow(radius,  2);
		return circle;
	}

}
