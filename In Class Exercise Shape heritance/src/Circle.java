public class Circle extends Shapes {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
}
