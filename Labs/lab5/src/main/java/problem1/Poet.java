package problem1;

public class Poet extends Artist {

    private String publishingCompany;
    private String lastPublishedCollection;

    public Poet(String firstName,
                String lastName,
                int age,
                String[] genres,
                String publishingCompany,
                String lastPublishedCollection) {

        super(firstName, lastName, age, genres);
        this.publishingCompany = publishingCompany;
        this.lastPublishedCollection = lastPublishedCollection;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public String getLastPublishedCollection() {
        return lastPublishedCollection;
    }
}