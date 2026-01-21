package shapes;

public class Polygon extends Shape {
    private int numSides;
    private double lengthSides;

    public Polygon(int numSides, double lengthSides) {
        super(null);
        this.numSides = numSides;
        this.lengthSides = lengthSides;
    }

    public Polygon(String name, int numSides, double lengthSides) {
        super(name);
        this.numSides = numSides;
        this.lengthSides = lengthSides;
    }
    
    public double calculateArea() {
        return ((numSides*lengthSides*lengthSides)/(4*Math.tan(Math.PI/numSides)));
    }
    public double calculatePerimeter() {
        return (numSides*lengthSides);
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Sides: " + numSides);
        System.out.println("Side Length: " + lengthSides);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parimeter: " + calculatePerimeter() + "\n");
    }
}
