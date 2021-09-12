package stepanPackage.practice3.task1;

public class Square extends Rectangle {
	public Square() {
		this.width = 5;
		this.length = 5;
	}
	
	public Square(double side) {
		this.width = side;
		this.length = side;
	}
	
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.length = side;
		this.color = color;
		this.filled = filled;
	}
	
	public double getSide() {
		return this.width;
	}
	
	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}
	
	public double getArea() {
		return Math.pow(this.getSide(), 2);
	}
	
	public double getPerimeter() {
		return this.getSide() * 4;
	}
	
	// @Override ????
	public String toString() {
		return "Width: " + this.getWidth() + "Length: " + this.getLength() + " , color: " + this.getColor() + " , filled: " + this.isFilled();
	}
}
