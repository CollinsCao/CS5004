package shape;

public class Rectangle extends AbstractShape {

    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height) {
        super(new Point2D(x, y));

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height must be positive");
        }

        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle: width = %.2f, height = %.2f"
                width, height
        );
    }

}
