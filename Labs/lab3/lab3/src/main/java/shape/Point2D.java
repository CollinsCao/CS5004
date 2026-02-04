package shape;

public class Point2D {

    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point2D)) {
            return false;
        }
        Point2D other = (Point2D) o;
        return this.x == other.x && this.y == other.y;
    }


}
