package problem1;

import java.time.LocalDateTime;

public class MonthlyDonation extends Donation {

    private LocalDateTime cancellationDate;

    public MonthlyDonation(double amount, LocalDateTime creationDate) {
        super(amount, creationDate);
    }

    public void cancel(LocalDateTime cancelDate) {
        if (cancelDate.isBefore(creationDate)) {
            throw new IllegalArgumentException("Cancellation date cannot be before creation date.");
        }
        this.cancellationDate = cancelDate;
    }

    @Override
    public double getAmountForYear(int year) {
        if (year < creationDate.getYear()) return 0;

        int months;

        if (year == creationDate.getYear()) {
            months = 12 - creationDate.getMonthValue() + 1;
        } else {
            months = 12;
        }

        if (cancellationDate != null && cancellationDate.getYear() == year) {
            months = cancellationDate.getMonthValue();
        }

        return months * amount;
    }
}