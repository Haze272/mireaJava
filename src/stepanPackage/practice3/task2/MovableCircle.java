package stepanPackage.practice3.task2;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
		this.center = center;
		center.x = x;
		center.y = y;
		center.xSpeed = xSpeed;
		center.ySpeed = ySpeed;
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}
	
	@Override
	public String toString() {
		return "The coordinates of circle: " + center.x + " " + center.y;
	}
}
