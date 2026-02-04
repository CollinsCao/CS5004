package shape;

import org.junit.jupiter.api.Test;
import shape.Rectangle;
import shape.Shape;

import static org.junit.jupiter.api.Assertions.*;
public class ShapeTest {

    @Test
    public void testDistanceFromOrigin() {
        Shape s = new Rectangle(3, 4, 2, 2);
        assertEquals(5.0, s.distanceFromOrigin(), 0.0001);
    }

    @Test
    public void testCompareToLessThan() {
        Shape small = new Circle(0, 0, 1);
        Shape large = new Circle(0, 0, 2);
        assertTrue(small.compareTo(large) < 0);
    }

    @Test
    public void testCompareToEqual() {
        Shape a = new Rectangle(0, 0, 2, 2);
        Shape b = new Rectangle(1, 1, 2, 2);
        assertEquals(0, a.compareTo(b));

    }

    @Test
    public void testCompareToGreaterThan() {
        Shape large = new Rectangle(0, 0, 4, 4);
        Shape small = new Rectangle(0, 0, 1, 1);
        assertTrue(large.compareTo(small) > 0);

    }

}
