import java.util.ArrayList;
import java.util.Scanner;
import shapes.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            shapes.add(addShape(scanner));
        }
        for (Shape shape : shapes) {
            shape.displayInfo();
        }

    }
    public static Shape addShape(Scanner scanner) {
        String type;
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
                        Double length = Double.parseDouble(scanner.nextLine());
                        System.out.print("Width: ");
                        Double width = Double.parseDouble(scanner.nextLine());
                        System.out.println();
                        return new Rectangle(name, length, width);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    break;
                case "triangle":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Side A: ");
                        Double SideA = Double.parseDouble(scanner.nextLine());
                        System.out.print("SideB: ");
                        Double SideB = Double.parseDouble(scanner.nextLine());
                        System.out.print("SideC: ");
                        Double SideC = Double.parseDouble(scanner.nextLine());
                        System.out.println();
                        return new Triangle(name, SideA, SideB, SideC);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    break;
                case "circle":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Radius: ");
                        Double radius = Double.parseDouble(scanner.nextLine());
                        System.out.println();
                        return new Circle(name, radius);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    break;
                case "polygon":
                    try {
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Number of Sides: ");
                        int numSides = Integer.parseInt(scanner.nextLine());
                        System.out.print("Length of Sides: ");
                        double lengthSides = Double.parseDouble(scanner.nextLine());
                        System.out.println();
                        return new Polygon(name, numSides, lengthSides);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter valid value." + e.getMessage());
                    }
                    break;
                case "":
                    break;
                default:
                    System.out.println("Please enter a valid shape.");
                    break;
            }
            continue;
        }
    }
}
