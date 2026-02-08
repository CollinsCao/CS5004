import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RookTest {

    @Test
    public void testValidMoveSameRow() {
        Rook rook = new Rook(3, 3, Color.WHITE);
        assertTrue(rook.canMove(3, 7));
    }

    @Test
    public void testValidMoveSameColumn() {
        Rook rook = new Rook(3, 3, Color.WHITE);
        assertTrue(rook.canMove(6, 3));
    }

    @Test
    public void testInvalidMoveDiagonal() {
        Rook rook = new Rook(3, 3, Color.WHITE);
        assertFalse(rook.canMove(5, 5));
    }

    @Test
    public void testCanKillOpponent() {
        Rook rook = new Rook(3, 3, Color.WHITE);
        Bishop enemy = new Bishop(3, 6, Color.BLACK);
        assertTrue(rook.canKill(enemy));
    }

    @Test
    public void testCannotKillSameColor() {
        Rook rook = new Rook(3, 3, Color.WHITE);
        Bishop friend = new Bishop(3, 6, Color.WHITE);
        assertFalse(rook.canKill(friend));
    }
}