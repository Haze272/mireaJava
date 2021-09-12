package stepanPackage.practice3.task1;

public class Circle extends Shape {
	protected double radius;
	
	public Circle() {
		this.radius = 7;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.getRadius();
	}
	
	// @Override ????
	public String toString() {
		return "Radius: " + this.getRadius() + " , color: " + this.getColor() + " , filled: " + this.isFilled();
	}
}
