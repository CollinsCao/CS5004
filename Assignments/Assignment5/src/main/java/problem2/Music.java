package problem2;

public class Music extends Item {

    private Creator creator;

    public Music(String title, int year, Creator creator) {
        super(title, year);
        this.creator = creator;
    }

    @Override
    public Creator getCreator() {
        return creator;
    }
}
