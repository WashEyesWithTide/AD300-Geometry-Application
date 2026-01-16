import java.util.ArrayList;
import java.util.Scanner;
import shapes.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Scanner scanner = new Scanner(System.in);
        shapes.add(addShape(scanner));
        shapes.add(addShape(scanner));
        for (Shape shape : shapes) {
            shape.displayInfo();
        }

    }
    public static Shape addShape(Scanner scanner) {
        String type = "";
        String name;
        while (true) {
            System.out.print("Desired Shape:");
            type = scanner.nextLine();
            switch(type) {
                case "rectangle":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Length: ");
                        Double length = scanner.nextDouble();
                        System.out.print("Width: ");
                        Double width = scanner.nextDouble();
                        System.out.println();
                        return new Rectangle(name, length, width);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    continue;
                case "triangle":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Side A: ");
                        Double SideA = scanner.nextDouble();
                        System.out.print("SideB: ");
                        Double SideB = scanner.nextDouble();
                        System.out.print("SideC: ");
                        Double SideC = scanner.nextDouble();
                        System.out.println();
                        return new Triangle(name, SideA, SideB, SideC);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    continue;
                case "circle":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Radius: ");
                        Double radius = scanner.nextDouble();
                        System.out.println();
                        return new Circle(name, radius);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    continue;
                case "polygon":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Number of Sides: ");
                        int numSides = scanner.nextInt();
                        System.out.print("Length of Sides: ");
                        double lengthSides = scanner.nextDouble();
                        System.out.println();
                        return new Polygon(name, numSides, lengthSides);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    continue;
                default:
                    System.out.println("Please enter a valid shape");
                    continue;
            }
        }
    }
}
