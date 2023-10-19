import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Select a shape (Rectangle, Circle, Triangle, Square) or type 'exit' to quit: ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("exit")) {
                break;
            }

            switch (choice) {
                case "rectangle":
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle("Rectangle", width, height);
                    displayShapeInfo(rectangle);
                    break;
                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle("Circle", radius);
                    displayShapeInfo(circle);
                    break;
                case "triangle":
                    System.out.print("Enter side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side 3: ");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle("Triangle", side1, side2, side3);
                    displayShapeInfo(triangle);
                    break;
                case "square":
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    Square square = new Square("Square", side);
                    displayShapeInfo(square);
                    break;
                default:
                    System.out.println("Invalid shape choice.");
                    break;
            }
        } while (true);
    }

    private static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.name);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
