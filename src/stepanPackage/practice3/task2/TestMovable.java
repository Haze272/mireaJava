
package stepanPackage.practice3.task2;

public class TestMovable {

	public static void main(String[] args) {
		MovablePoint p1 = new MovablePoint(1, 1, 1, 1);

		MovableCircle c1 = new MovableCircle(0, 0, 1, 1, 10, p1);
		System.out.println(c1.toString());

		p1.moveUp();
		System.out.println(p1.toString());
		System.out.println(c1.toString());

		c1.moveUp();
		System.out.println(p1.toString());
		System.out.println(c1.toString());

		MovablePoint rectanlePoint1 = new MovablePoint(1, 1, 1, 1);
		MovablePoint rectanlePoint2 = new MovablePoint(2, 2, 2, 2);

		MovableRect rectangle = new MovableRect(7, 7, 13, 1, 3, 3, rectanlePoint1, rectanlePoint2);
		System.out.println(rectangle.toString());
		System.out.println(rectanlePoint1.toString());
		System.out.println(rectanlePoint2.toString());

		rectanlePoint1.moveRight();
		System.out.println(rectangle.toString());
	}

}
