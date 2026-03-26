package problem1;

import java.time.LocalDateTime;

public class OneTimeDonation extends Donation {

    public OneTimeDonation(double amount, LocalDateTime creationDate) {
        super(amount, creationDate);
    }

    @Override
    public double getAmountForYear(int year) {
        return creationDate.getYear() == year ? amount : 0;
    }
}
