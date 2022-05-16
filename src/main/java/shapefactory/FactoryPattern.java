package shapefactory;

public class FactoryPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		UserInput uIn = new UserInput();

		// get an object of shape.
		Shape shape1 = shapeFactory.getShape(uIn.input());

		// call draw method of shape.
		shape1.draw();

	}
}
