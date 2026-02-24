public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();

        // Using constructor with radius only
        Circle c2 = new Circle(5);

        // Using constructor with radius + colour
        Circle c3 = new Circle(3.5, "Blue");

        // Interacting with objects
        System.out.println("Circle 1: " + c1.toString());
        System.out.println("Area: " + c1.getArea());

        System.out.println("\nCircle 2: " + c2.toString());
        System.out.println("Area: " + c2.getArea());

        System.out.println("\nCircle 3: " + c3.toString());
        System.out.println("Area: " + c3.getArea());
    }
}
