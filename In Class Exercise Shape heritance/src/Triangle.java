public class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public double getHypotenuse() {
        return Math.sqrt((base * base) + (height * height));
    }
}
