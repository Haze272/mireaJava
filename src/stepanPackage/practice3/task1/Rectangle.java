package stepanPackage.practice3.task1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle() {
		this.width = 4;
		this.length = 5;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return this.getWidth() * this.getLength();
	}
	
	public double getPerimeter() {
		return (this.getWidth() + this.getLength()) * 2;
	}
	
	// @Override ????
	public String toString() {
		return "Width: " + this.getWidth() + "Length: " + this.getLength() + " , color: " + this.getColor() + " , filled: " + this.isFilled();
	}
}
