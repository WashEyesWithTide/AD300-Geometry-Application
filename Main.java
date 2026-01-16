import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
        new Rectangle(5, 10),
        new Triangle(3, 4, 5),
        new Circle(7)
        };
        for (Shape shape : shapes) {
            shape.displayInfo();
        }
    }
}
