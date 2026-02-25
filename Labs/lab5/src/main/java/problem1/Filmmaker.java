package problem1;

public class Filmmaker extends PerformingArtist {

    public Filmmaker(String firstName,
                     String lastName,
                     int age,
                     String[] genres,
                     String[] movies,
                     String[] series,
                     String[] otherMultimedia) {

        super(firstName, lastName, age, genres, movies, series, otherMultimedia);
    }
}