package problem1;

public class Actor extends PerformingArtist {

    public Actor(String firstName,
                 String lastName,
                 int age,
                 String[] genres,
                 String[] movies,
                 String[] series,
                 String[] otherMultimedia) {

        super(firstName, lastName, age, genres, movies, series, otherMultimedia);
    }
}