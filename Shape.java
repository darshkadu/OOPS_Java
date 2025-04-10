abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(4);
        Shape r = new Rectangle(3, 5);
        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
