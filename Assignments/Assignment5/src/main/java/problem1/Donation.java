package problem1;

import java.time.LocalDateTime;

public abstract class Donation {

    protected double amount;
    protected LocalDateTime creationDate;

    public Donation(double amount, LocalDateTime creationDate) {
        this.amount = amount;
        this.creationDate = creationDate;
    }

    public abstract double getAmountForYear(int year);
}
