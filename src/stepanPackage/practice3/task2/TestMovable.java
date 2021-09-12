//
// Practice ¹–3 task2 Berkunov Stepan INBO-02-20
//

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
	}

}
