package problem1;

public abstract class PerformingArtist extends Artist {

    private String[] movies;
    private String[] series;
    private String[] otherMultimedia;

    public PerformingArtist(String firstName,
                            String lastName,
                            int age,
                            String[] genres,
                            String[] movies,
                            String[] series,
                            String[] otherMultimedia) {

        super(firstName, lastName, age, genres);

        this.movies = movies;
        this.series = series;
        this.otherMultimedia = otherMultimedia;
    }

    public String[] getMovies() {
        return movies;
    }

    public String[] getSeries() {
        return series;
    }

    public String[] getOtherMultimedia() {
        return otherMultimedia;
    }
}