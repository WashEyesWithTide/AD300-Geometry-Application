package shapes;

public abstract class Shape {
    public Shape(String name) {
        this.name = name;
    }
    private String name;

    public String getName() {
        return this.name;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void displayInfo();
 }