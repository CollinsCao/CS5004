package problem2;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Item> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public Catalog(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    // Overloading 1
    public List<Item> search(String keyword) {
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }

    // Overloading 2
    public List<Item> search(Author author) {
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item instanceof Book) {
                if (((Book) item).getCreator().equals(author)) {
                    result.add(item);
                }
            }
        }

        return result;
    }

    // Overloading 3
    public List<Item> search(RecordingArtist artist) {
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item instanceof Music) {
                Creator c = item.getCreator();

                if (c instanceof RecordingArtist && c.equals(artist)) {
                    result.add(item);
                }

                if (c instanceof Band) {
                    if (((Band) c).getMembers().contains(artist)) {
                        result.add(item);
                    }
                }
            }
        }

        return result;
    }
}
