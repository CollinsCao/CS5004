package problem1;

import java.time.LocalDateTime;

public class Pledge extends Donation {

    private LocalDateTime processingDate;

    public Pledge(double amount, LocalDateTime creationDate) {
        super(amount, creationDate);
    }

    public void setProcessingDate(LocalDateTime processingDate) {
        if (processingDate != null && processingDate.isBefore(creationDate)) {
            throw new IllegalArgumentException("Processing date cannot be before creation date.");
        }
        this.processingDate = processingDate;
    }

    @Override
    public double getAmountForYear(int year) {
        if (processingDate != null && processingDate.getYear() == year) {
            return amount;
        }
        return 0;
    }
}
