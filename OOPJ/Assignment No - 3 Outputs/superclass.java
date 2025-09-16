abstract class Shape{
	abstract double area();
}
class Rectangle extends Shape{
	double length, breadth;
	
	Rectangle(double length, double breadth){
		this.length =length;
		this.breadth = breadth;
	}
	
	double area(){
		return length * breadth;
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double area(){
		return Math.PI * radius * radius;
	}
	
}

class superclass{
	public static void main(String args[]){
		Rectangle r = new Rectangle(5 , 10);
		Circle c = new Circle(7);
		
		System.out.println("Rectangle Area = " + r.area());
		System.out.println("Circle Area = " + String.format("%.2f", c.area()));
	}
}