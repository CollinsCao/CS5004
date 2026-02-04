package shape;

public class Circle extends AbstractShape {

    private final double radius;

    public Circle(double x, double y, double radius) {
        super(new Point2D(x, y));

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: radius=%.2f", radius);
    }
}