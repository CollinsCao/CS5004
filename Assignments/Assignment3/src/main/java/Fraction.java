/**
 * Represents a mathematical fraction with an integer numerator
 * and a strictly positive integer denominator.
 *
 * A Fraction supports arithmetic operations such as addition
 * and reciprocal, and can be compared to other fractions.
 */
public interface Fraction extends Comparable<Fraction> {

    /**
     * Returns the numerator of this fraction.
     *
     * @return the numerator value
     */
    int getNumerator();

    /**
     * Returns the denominator of this fraction.
     *
     * The denominator is guaranteed to be positive.
     *
     * @return the denominator value
     */
    int getDenominator();

    /**
     * Sets the numerator of this fraction.
     *
     * @param n the new numerator value
     */
    void setNumerator(int n);

    /**
     * Sets the denominator of this fraction.
     *
     * The denominator must remain strictly positive.
     *
     * @param d the new denominator value
     * @throws IllegalArgumentException if d <= 0
     */
    void setDenominator(int d);

    /**
     * Returns the decimal (double) value of this fraction.
     *
     * @return the fraction as a double value
     */
    double toDouble();

    /**
     * Returns the reciprocal of this fraction.
     *
     * @return a new Fraction representing the reciprocal
     * @throws IllegalArgumentException if numerator is zero
     */
    Fraction reciprocal();

    /**
     * Adds another fraction to this fraction.
     *
     * @param other the fraction to be added
     * @return a new Fraction representing the sum
     */
    Fraction add(Fraction other);

    /**
     * Compares this fraction to another fraction.
     *
     * @param other the fraction to compare with
     * @return negative if this < other,
     *         zero if equal,
     *         positive if this > other
     */
    int compareTo(Fraction other);
}
