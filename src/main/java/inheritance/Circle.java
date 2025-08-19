package inheritance;

public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
