package problem2;

public class Book extends Item {

    private Author author;

    public Book(String title, int year, Author author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public Creator getCreator() {
        return author;
    }
}