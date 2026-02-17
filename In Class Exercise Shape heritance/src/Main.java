public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        Triangle triangle = new Triangle("Green", 3, 4);

        System.out.println(circle.getDescription() + " area: " + circle.getArea());
        System.out.println(rectangle.getDescription() + " area: " + rectangle.getArea());
        System.out.println(triangle.getDescription() + " area: " + triangle.getArea());

        // Calling shape-specific methods
        System.out.println("Circle diameter: " + circle.getDiameter());
        System.out.println("Rectangle is square: " + rectangle.isSquare());
        System.out.println("Triangle hypotenuse: " + triangle.getHypotenuse());
    }
}

