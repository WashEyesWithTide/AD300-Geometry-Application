package shapes;

public abstract class Shape {
    public Shape(String name) {
        this.name = name;
    }
    public String name;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void displayInfo();
 }