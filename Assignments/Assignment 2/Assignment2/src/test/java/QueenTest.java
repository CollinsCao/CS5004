import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueenTest {

    @Test
    public void testDiagonalMove() {
        Queen queen = new Queen(3, 3, Color.WHITE);
        assertTrue(queen.canMove(6, 6));
    }

    @Test
    public void testStraightMove() {
        Queen queen = new Queen(3, 3, Color.WHITE);
        assertTrue(queen.canMove(3, 0));
    }

    @Test
    public void testInvalidMove() {
        Queen queen = new Queen(3, 3, Color.WHITE);
        assertFalse(queen.canMove(4, 5));
    }
}
