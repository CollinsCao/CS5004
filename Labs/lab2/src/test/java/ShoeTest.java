import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoeTest {

    @Test
    public void testConstructorValid() {
        Shoe shoe = new Shoe(Kind.SNEAKER, Color.BLACK, Brand.NIKE, 9.5);

        assertEquals(Kind.SNEAKER, shoe.getKind());
        assertEquals(Color.BLACK, shoe.getColor());
        assertEquals(Brand.NIKE, shoe.getBrand());
        assertEquals(9.5, shoe.getSize());
    }

    @Test
    public void testConstructorNikeDressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Shoe(Kind.DRESS, Color.WHITE, Brand.NIKE, 8.0);
        });
    }

    @Test
    public void testToStringContainsAllAttributes() {
        Shoe shoe = new Shoe(Kind.BOOT, Color.BROWN, Brand.CLARKS, 10.0);
        String result = shoe.toString();

        assertTrue(result.contains("Boot"));
        assertTrue(result.contains("Brown"));
        assertTrue(result.contains("Clarks"));
        assertTrue(result.contains("10.0"));
    }
}