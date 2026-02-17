public class Shape {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // This will be overridden by subclasses
    public double getArea() {
        return 0.0;
    }

    public String getDescription() {
        return "A " + color + " " + name;
    }
}
