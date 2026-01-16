package shapes;

public class Triangle extends Shape{
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parimeter: " + calculatePerimeter() + "\n");
    }
}