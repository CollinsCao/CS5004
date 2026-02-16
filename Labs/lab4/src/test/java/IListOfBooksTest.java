import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IListOfBooksTest {

    Book b1 = new Book("A", "Author1", 2000, 10f);
    Book b2 = new Book("B", "Author2", 2010, 20f);

    IListOfBooks empty = new EmptyNode();
    IListOfBooks list =
            new ElementNode(b1,
                    new ElementNode(b2,
                            new EmptyNode()));

    // count tests
    @Test
    public void testEmptyCount() {
        assertEquals(0, empty.count());
    }

    @Test
    public void testNonEmptyCount() {
        assertEquals(2, list.count());
    }

    // totalPrice tests
    @Test
    public void testEmptyTotalPrice() {
        assertEquals(0f, empty.totalPrice());
    }

    @Test
    public void testNonEmptyTotalPrice() {
        assertEquals(30f, list.totalPrice());
    }

    // allBefore tests
    @Test
    public void testAllBeforeKeepsOne() {
        IListOfBooks filtered = list.allBefore(2005);
        assertEquals(1, filtered.count());
    }

    @Test
    public void testAllBeforeKeepsNone() {
        IListOfBooks filtered = list.allBefore(1990);
        assertEquals(0, filtered.count());
    }

    // addAtEnd tests
    @Test
    public void testAddAtEndToEmpty() {
        IListOfBooks newList = empty.addAtEnd(b1);
        assertEquals(1, newList.count());
    }

    @Test
    public void testAddAtEndToNonEmpty() {
        IListOfBooks newList =
                list.addAtEnd(new Book("C", "Author3", 2020, 30f));
        assertEquals(3, newList.count());
    }

    // toString tests
    @Test
    public void testEmptyToString() {
        assertEquals("", empty.toString());
    }

    @Test
    public void testNonEmptyToString() {
        assertTrue(list.toString().contains("A"));
    }
}