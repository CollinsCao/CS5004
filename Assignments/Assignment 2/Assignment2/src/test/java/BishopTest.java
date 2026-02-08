import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BishopTest {

    @Test
    public void testDiagonalMove() {
        Bishop bishop = new Bishop(2, 2, Color.WHITE);
        assertTrue(bishop.canMove(5, 5));
    }

    @Test
    public void testInvalidNonDiagonalMove() {
        Bishop bishop = new Bishop(2, 2, Color.WHITE);
        assertFalse(bishop.canMove(2, 5));
    }

    @Test
    public void testCanKillOpponent() {
        Bishop bishop = new Bishop(2, 2, Color.WHITE);
        Pawn enemy = new Pawn(5, 5, Color.BLACK);
        assertTrue(bishop.canKill(enemy));
    }
}