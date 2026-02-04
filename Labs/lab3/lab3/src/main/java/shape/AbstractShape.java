package shape;

public abstract class AbstractShape implements Shape {

    protected final Point2D referencePoint;

    protected  AbstractShape(Point2D referencePoint) {
        this.referencePoint = referencePoint;
    }

    @Override
    public double distanceFromOrigin() {
        return referencePoint.distanceFromOrigin();
    }
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.getArea(), other.getArea());
    }
}
