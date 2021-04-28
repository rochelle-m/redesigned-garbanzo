
public class Triangle extends Shape {
	private float base, height;
	
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	void calculateArea() {	
		area = (float)0.5 * base * height;
	}

}
