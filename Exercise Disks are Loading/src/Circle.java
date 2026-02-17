public class Circle {

    // Private properties
    private double radius;
    private String colour;

    // 1. Default constructor: green circle, radius 2
    public Circle() {
        this.radius = 2;
        this.colour = "Green";
    }

    // 2. Constructor that sets only radius
    public Circle(double radius) {
        this.radius = radius;
        this.colour = "Green"; // default colour
    }

    // 3. Constructor that sets radius and colour
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Radius = " + radius + ", Colour = " + colour;
    }
}
