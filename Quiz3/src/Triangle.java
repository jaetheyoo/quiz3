/**
 * class Triangle that extends Geometric Object
 * @author Jae
 *Attributes: side1, side2, side3, all private doubles
 *getters for all attributes
 *no arg constructor
 *constructor that instantiates a triangle with variable sides
 *methods getArea that returns double area of triangle, 
 *getPerimeter that returns perimeter of triangle, 
 *and toString that returns a String description of triangle
 */
public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	private Triangle(){
		
	}
		
	public Triangle(double Side1, double Side2, double Side3) {
		this.side1 = Side1;
		this.side2 = Side2;
		this.side3 = Side3;
	}
	
	
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3)); // heron's formula for area of tri with SSS
		return area;
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString(){
		return "triangle's side1 = " + side1 + ", side2 = " + side2 + ", and side3 = " + side3;		
	}
}
