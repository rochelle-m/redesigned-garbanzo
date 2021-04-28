
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getFactory("circle", (float)7.0, (float)0.0);
		shape1.calculateArea();
		float area1 = shape1.getArea();
		
		Shape shape2 = shapeFactory.getFactory("rectangle", (float)4, (float)5);
		shape2.calculateArea();
		float area2 = shape2.getArea();
		
		Shape shape3 = shapeFactory.getFactory("triangle", (float)4, (float)5);
		shape3.calculateArea();
		float area3 = shape3.getArea();
		
		System.out.print("\n Circle: " + area1 + 
				"\n Rectangle: " + area2 + 
				"\n Triangle " + area3);
		
	}

}
