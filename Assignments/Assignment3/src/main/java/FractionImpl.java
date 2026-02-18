/**
 * Concrete implementation of Fraction.
 * Denominator is always strictly positive.
 * Fraction is always stored in simplest form.
 */
public class FractionImpl implements Fraction {

    private int numerator;
    private int denominator;

    public FractionImpl(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Denominator must be positive.");
        }
        normalize(numerator, denominator);
    }

    /**
     * Reduces fraction to simple form.
     * Assumes denominator > 0.
     */
    private void normalize(int num, int den) {
        int divisor = gcd(num, den);
        this.numerator = num / divisor;
        this.denominator = den / divisor;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public void setNumerator(int n) {
        normalize(n, this.denominator);
    }

    @Override
    public void setDenominator(int d) {
        if (d <= 0) {
            throw new IllegalArgumentException("Denominator must be positive.");
        }
        normalize(this.numerator, d);
    }

    @Override
    public double toDouble() {
        return (double) numerator / denominator;
    }

    @Override
    public Fraction reciprocal() {
        if (numerator == 0) {
            throw new IllegalArgumentException("Zero does not have a reciprocal.");
        }

        int newNumerator = denominator;
        int newDenominator = numerator;

        // Ensure denominator positive
        if (newDenominator < 0) {
            newNumerator = -newNumerator;
            newDenominator = -newDenominator;
        }

        return new FractionImpl(newNumerator, newDenominator);
    }

    @Override
    public Fraction add(Fraction other) {
        int newNumerator =
                this.numerator * other.getDenominator()
                        + other.getNumerator() * this.denominator;

        int newDenominator =
                this.denominator * other.getDenominator();

        return new FractionImpl(newNumerator, newDenominator);
    }

    @Override
    public int compareTo(Fraction other) {
        long left = (long) this.numerator * other.getDenominator();
        long right = (long) other.getNumerator() * this.denominator;
        return Long.compare(left, right);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}
