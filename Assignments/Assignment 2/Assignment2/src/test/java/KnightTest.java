import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KnightTest {

    @Test
    public void testValidKnightMove() {
        Knight knight = new Knight(4, 4, Color.WHITE);
        assertTrue(knight.canMove(6, 5));
    }

    @Test
    public void testInvalidKnightMove() {
        Knight knight = new Knight(4, 4, Color.WHITE);
        assertFalse(knight.canMove(5, 5));
    }

    @Test
    public void testKnightCanKillEnemy() {
        Knight knight = new Knight(4, 4, Color.WHITE);
        Pawn enemy = new Pawn(6, 5, Color.BLACK);
        assertTrue(knight.canKill(enemy));
    }
}