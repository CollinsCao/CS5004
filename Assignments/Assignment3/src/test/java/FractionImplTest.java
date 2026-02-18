import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for FractionImpl.
 *
 * These tests verify:
 * - Constructor behavior
 * - Simplification
 * - Invariant enforcement
 * - Arithmetic operations
 * - Comparison logic
 * - Exceptional cases
 */
public class FractionImplTest {



    @Test
    void testConstructorValid() {
        Fraction f = new FractionImpl(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    void testConstructorSimplifies() {
        Fraction f = new FractionImpl(4, 2);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testConstructorZeroNumerator() {
        Fraction f = new FractionImpl(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testConstructorInvalidZeroDenominator() {
        assertThrows(IllegalArgumentException.class,
                () -> new FractionImpl(1, 0));
    }

    @Test
    void testConstructorInvalidNegativeDenominator() {
        assertThrows(IllegalArgumentException.class,
                () -> new FractionImpl(1, -3));
    }


    @Test
    void testSetNumerator() {
        Fraction f = new FractionImpl(1, 2);
        f.setNumerator(4); // 4/2 simplifies to 2/1
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testSetDenominatorValid() {
        Fraction f = new FractionImpl(1, 2);
        f.setDenominator(4);
        assertEquals(1, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    void testSetDenominatorInvalid() {
        Fraction f = new FractionImpl(1, 2);
        assertThrows(IllegalArgumentException.class,
                () -> f.setDenominator(0));
    }



    @Test
    void testToDouble() {
        Fraction f = new FractionImpl(1, 2);
        assertEquals(0.5, f.toDouble(), 0.0001);
    }

    @Test
    void testToDoubleNegative() {
        Fraction f = new FractionImpl(-1, 2);
        assertEquals(-0.5, f.toDouble(), 0.0001);
    }



    @Test
    void testToStringSimplified() {
        Fraction f = new FractionImpl(4, 2);
        assertEquals("2 / 1", f.toString());
    }

    @Test
    void testToStringZero() {
        Fraction f = new FractionImpl(0, 5);
        assertEquals("0 / 1", f.toString());
    }



    @Test
    void testReciprocalValid() {
        Fraction f = new FractionImpl(2, 3);
        Fraction r = f.reciprocal();
        assertEquals(3, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    @Test
    void testReciprocalNegative() {
        Fraction f = new FractionImpl(-2, 3);
        Fraction r = f.reciprocal();
        assertEquals(-3, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    @Test
    void testReciprocalZero() {
        Fraction f = new FractionImpl(0, 5);
        assertThrows(IllegalArgumentException.class,
                f::reciprocal);
    }



    @Test
    void testAddSameDenominator() {
        Fraction f1 = new FractionImpl(1, 4);
        Fraction f2 = new FractionImpl(2, 4);

        Fraction result = f1.add(f2);

        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void testAddDifferentDenominators() {
        Fraction f1 = new FractionImpl(1, 2);
        Fraction f2 = new FractionImpl(1, 3);

        Fraction result = f1.add(f2);

        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void testAddNegative() {
        Fraction f1 = new FractionImpl(-1, 2);
        Fraction f2 = new FractionImpl(1, 2);

        Fraction result = f1.add(f2);

        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }



    @Test
    void testCompareToLessThan() {
        Fraction f1 = new FractionImpl(1, 3);
        Fraction f2 = new FractionImpl(1, 2);
        assertTrue(f1.compareTo(f2) < 0);
    }

    @Test
    void testCompareToEqual() {
        Fraction f1 = new FractionImpl(2, 4);
        Fraction f2 = new FractionImpl(1, 2);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    void testCompareToGreaterThan() {
        Fraction f1 = new FractionImpl(3, 2);
        Fraction f2 = new FractionImpl(1, 2);
        assertTrue(f1.compareTo(f2) > 0);
    }
}
