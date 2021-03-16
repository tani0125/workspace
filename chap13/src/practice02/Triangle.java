package practice02;

public class Triangle {

	double bottom;
	double height;

	public Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	public double area() {
		double area = this.bottom * this.height / 2;
		return area;
	}

}
