

package stepanPackage.practice3.task1;

public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1); // which version?
		System.out.println(s1.getArea()); // which version?
		System.out.println(s1.getPerimeter()); // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// System.out.println(s1.getRadius());
		 
		Circle c1 = (Circle)s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		 
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		 
		Rectangle r1 = (Rectangle)s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		 
		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());

	}

}
