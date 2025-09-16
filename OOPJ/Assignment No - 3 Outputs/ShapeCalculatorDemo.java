interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class ShapeCalculatorDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 5);
        Shape s = new Square(4);

        System.out.println("Circle Area = " + String.format("%.2f", c.calculateArea()));
        System.out.println("Rectangle Area = " + r.calculateArea());
        System.out.println("Square Area = " + s.calculateArea());
    }
}
