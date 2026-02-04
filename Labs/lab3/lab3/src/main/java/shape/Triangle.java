package shape;

public class Triangle extends AbstractShape {

    private final Point2D p1;
    private final Point2D p2;
    private final Point2D p3;

    /**
     * Constructs a Triangle using three points.
     * The first point is the reference point.
     * @throws IllegalArgumentException if any two points are identical
     */
    public Triangle(double x1, double y1,
                    double x2, double y2,
                    double x3, double y3){
        //First point is the reference point
        super(new Point2D(x1, y1));

        this.p1 = new Point2D(x1, y1);
        this.p2 = new Point2D(x2, y2);
        this.p3 = new Point2D(x3, y3);

        //Invalid if any two points are the same
        if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
            throw new IllegalArgumentException("Triangle points must be distinct");
        }
    }

    /**
     * Computes the preimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        double ab = sideLength(p1, p2);
        double bc = sideLength(p2, p3);
        double ca = sideLength(p3, p1);
        return ab + bc + ca;
    }


    /**
     * Computer the area of the triangle using Heron's formula.
     * Collinear points result in area = 0.
     */
    @Override
    public double getArea() {
        double a = sideLength(p1, p2);
        double b = sideLength(p2, p3);
        double c = sideLength(p3, p1);

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    /**
     * Returns a string representation of the triangle.
     */
    @Override
    public String toString() {
        return String.format(
                "Triangle: p1 = (%.2f, %.2f), p2=(%.2f, %.2f), p3=(%.2f, %.2f)",
                p1.getX(), p1.getY(),
                p2.getX(), p2.getY(),
                p3.getX(), p3.getY()
        );
    }


    /**
     * Helper method to compute distance between two points.
     */
    private double sideLength(Point2D a, Point2D b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

