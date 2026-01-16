package shapes;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parimeter: " + calculatePerimeter() + "\n");
    }
}
