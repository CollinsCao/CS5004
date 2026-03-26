package problem1;

import java.util.ArrayList;
import java.util.List;

public class NonProfit {

    private String name;
    private List<Donation> donations;

    public NonProfit(String name) {
        this.name = name;
        this.donations = new ArrayList<>();
    }

    public void addDonation(Donation donation) {
        donations.add(donation);
    }

    public double getTotalDonationsForYear(int year) {
        double total = 0;

        for (Donation d : donations) {
            total += d.getAmountForYear(year);
        }

        return total;
    }
}
