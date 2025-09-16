class ShapeArea{
	double calculateArea(int side){
		return side * side;
	}
		
	double calculateArea(int length, int breadth){
		return length * breadth;
		
	}
	double calculateArea(double radius){
		return Math.PI * radius * radius;
	}
	
	public static void main(String args[]){
	ShapeArea s = new ShapeArea();
	
	System.out.println("Square Area = " + s.calculateArea(5));
	System.out.println("Rectangle Area =" + s.calculateArea(4,6));
	System.out.println("Circle Area = " + String.format("%.2f" , s.calculateArea(3.0)) );
	}
	
}
