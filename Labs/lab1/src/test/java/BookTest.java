import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        this.book1 = new Book("1984", "George Orwell", 328);
        this.book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        this.book3 = new Book("Clean Code", "Robert C. Martin", 464);
    }

    @Test
    void getTitle() {
        Assertions.assertEquals("1984", this.book1.getTitle());
        Assertions.assertEquals("The Hobbit", this.book2.getTitle());
        Assertions.assertEquals("Clean Code", this.book3.getTitle());
    }

    @Test
    void getAuthor() {
        Assertions.assertEquals("George Orwell", this.book1.getAuthor());
        Assertions.assertEquals("J.R.R. Tolkien", this.book2.getAuthor());
        Assertions.assertEquals("Robert C. Martin", this.book3.getAuthor());
    }

    @Test
    void getPages() {
        Assertions.assertEquals(328, this.book1.getPages());
        Assertions.assertEquals(310, this.book2.getPages());
        Assertions.assertEquals(464, this.book3.getPages());
    }
}
