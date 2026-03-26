package app;

import problem1.*;
import problem2.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("====== Problem 1: Donation System ======");

        // Create NonProfit
        NonProfit np = new NonProfit("Test Org");

        // One-time donation
        OneTimeDonation d1 = new OneTimeDonation(
                100,
                LocalDateTime.of(2026, 1, 1, 0, 0)
        );

        // Monthly donation
        MonthlyDonation d2 = new MonthlyDonation(
                10,
                LocalDateTime.of(2026, 2, 1, 0, 0)
        );

        // Cancel mid-year (optional test)
        d2.cancel(LocalDateTime.of(2026, 8, 1, 0, 0));

        // Pledge
        Pledge d3 = new Pledge(
                200,
                LocalDateTime.of(2026, 3, 1, 0, 0)
        );

        d3.setProcessingDate(LocalDateTime.of(2026, 5, 1, 0, 0));

        // Add donations
        np.addDonation(d1);
        np.addDonation(d2);
        np.addDonation(d3);

        // Calculate total
        double total = np.getTotalDonationsForYear(2026);

        System.out.println("Total donations for 2026: " + total);


        System.out.println("\n====== Problem 2: Library Catalog ======");

        // Create creators
        Author author = new Author("John", "Doe");
        RecordingArtist artist = new RecordingArtist("Taylor", "Swift");

        // Band example（加分点）
        RecordingArtist m1 = new RecordingArtist("A", "One");
        RecordingArtist m2 = new RecordingArtist("B", "Two");
        Band band = new Band("Cool Band", Arrays.asList(m1, m2));

        // Create items
        Book book = new Book("Java Basics", 2020, author);
        Music music1 = new Music("Love Story", 2008, artist);
        Music music2 = new Music("Band Song", 2022, band);

        // Create catalog
        Catalog catalog = new Catalog();
        catalog.add(book);
        catalog.add(music1);
        catalog.add(music2);

        // Search tests
        System.out.println("Search 'Java': " + catalog.search("Java").size());
        System.out.println("Search by author: " + catalog.search(author).size());
        System.out.println("Search by artist: " + catalog.search(artist).size());
        System.out.println("Search by band member: " + catalog.search(m1).size());
    }
}