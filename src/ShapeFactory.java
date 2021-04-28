
public class ShapeFactory {
	public Shape getFactory(String shapeName, float param1, float param2) {
		String shapeToCreate = shapeName.toLowerCase();
		
		switch(shapeToCreate) {
			case "rectangle" : return new Rectangle(param1, param2); 
			case "circle" : return new Circle(param1);
			case "triangle" : return new Triangle(param1, param2);
			default: return null;

		}
	}
}
