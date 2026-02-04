package shape;

public interface Shape extends Comparable<Shape> {
    double getArea();
    double getPerimeter();
    double distanceFromOrigin();
}
