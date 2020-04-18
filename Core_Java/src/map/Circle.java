package map;

import java.util.Map;

public class Circle {
	private int radius;
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	/*public Circle(int radius) {
		this.radius = radius;
	}
	*/
	public double  getPerimeter()
	{
		double result=2*3.14*radius;
		return result;
	}
}
