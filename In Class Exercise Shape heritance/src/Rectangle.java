public class Rectangle extends Shapes {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
