
public class Circle extends Shape{
	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	void calculateArea() {
		area = (float)3.14 * radius * radius;
	}
	
}
