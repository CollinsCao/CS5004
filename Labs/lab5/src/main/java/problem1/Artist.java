package problem1;

public abstract class Artist {

    private String firstName;
    private String lastName;
    private int age;
    private String[] genres;
    private String[] awards;

    public Artist(String firstName,
                  String lastName,
                  int age,
                  String[] genres) {

        if (age < 0 || age > 128) {
            throw new IllegalArgumentException("Age must be between 0 and 128.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.genres = genres;
        this.awards = new String[0];
    }

    public void receiveAward(String award) {
        String[] newAwards = new String[this.awards.length + 1];

        for (int i = 0; i < this.awards.length; i++) {
            newAwards[i] = this.awards[i];
        }

        newAwards[this.awards.length] = award;
        this.awards = newAwards;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getAwards() {
        return awards;
    }
}