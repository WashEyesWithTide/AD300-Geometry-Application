package shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }    
    
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parimeter: " + calculatePerimeter() + "\n");
    }
}
