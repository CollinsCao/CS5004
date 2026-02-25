package problem1;

public class ArtistTestMain {

    public static void main(String[] args) {

        String[] genres = {"Drama", "Comedy"};
        String[] movies = {"Movie A", "Movie B"};
        String[] series = {"Series X"};
        String[] multimedia = {"Podcast Y"};

        Actor actor = new Actor(
                "Tom",
                "Hanks",
                60,
                genres,
                movies,
                series,
                multimedia
        );


        actor.receiveAward("Oscar");
        actor.receiveAward("Golden Globe");

        System.out.println("Actor: " + actor.getFirstName() + " " + actor.getLastName());
        System.out.println("Age: " + actor.getAge());
        System.out.println("Awards count: " + actor.getAwards().length);

        System.out.println("-----");


        String[] musicGenres = {"Rock"};

        Musician musician = new Musician(
                "John",
                "Lennon",
                40,
                musicGenres,
                "EMI",
                "Imagine"
        );

        musician.receiveAward("Grammy");

        System.out.println("Musician: " + musician.getFirstName() + " " + musician.getLastName());
        System.out.println("Recording Company: " + musician.getRecordingCompany());
        System.out.println("Awards count: " + musician.getAwards().length);

        System.out.println("-----");


        String[] poetGenres = {"Modern"};

        Poet poet = new Poet(
                "Emily",
                "Dickinson",
                55,
                poetGenres,
                "Harper",
                "Collected Poems"
        );

        poet.receiveAward("Literature Prize");

        System.out.println("Poet: " + poet.getFirstName() + " " + poet.getLastName());
        System.out.println("Publishing Company: " + poet.getPublishingCompany());
        System.out.println("Awards count: " + poet.getAwards().length);
    }
}
