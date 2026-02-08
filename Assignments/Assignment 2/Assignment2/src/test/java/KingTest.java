import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KingTest {

    @Test
    public void testOneStepMove() {
        King king = new King(4, 4, Color.WHITE);
        assertTrue(king.canMove(5, 5));
    }

    @Test
    public void testTooFarMove() {
        King king = new King(4, 4, Color.WHITE);
        assertFalse(king.canMove(6, 6));
    }

    @Test
    public void testCannotStayInPlace() {
        King king = new King(4, 4, Color.WHITE);
        assertFalse(king.canMove(4, 4));
    }
}
