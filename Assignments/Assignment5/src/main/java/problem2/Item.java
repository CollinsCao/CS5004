package problem2;

public abstract class Item {

    protected String title;
    protected int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public abstract Creator getCreator();

    public String getTitle() {
        return title;
    }
}
