abstract class Shape{	
	abstract void draw();
	
}
class Circle extends Shape{
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	void draw(){
		System.out.println("Drawing Circle of Radius :" + radius);
	}
}
class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	
	}
	void draw(){
		System.out.println("Drawing Rectangle of length " + length + "and breadth " + breadth );
	}
}

class ShapeDrawing{
	public static void main(String args[]){
		Shape s1 = new Circle(7);
		Shape s2 = new Rectangle(5,7);
			s1.draw();
			s2.draw();
	}
}
