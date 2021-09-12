package stepanPackage.practice3.task2;

public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		this.y += this.ySpeed;
	}
	
	@Override
	public void moveDown() {
		this.y -= this.ySpeed;
	}
	
	@Override
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	
	@Override
	public void moveRight() {
		this.x += this.xSpeed;
	}
	
	@Override
	public String toString() {
		return "The coordinates of point: " + this.x + " " + this.y;
	}
}
