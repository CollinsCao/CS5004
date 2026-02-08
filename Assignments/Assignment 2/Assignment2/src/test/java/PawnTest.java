import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test
    public void testWhitePawnMoveForward() {
        Pawn pawn = new Pawn(1, 3, Color.WHITE);
        assertTrue(pawn.canMove(2, 3));
    }

    @Test
    public void testWhitePawnFirstMoveTwoSteps() {
        Pawn pawn = new Pawn(1, 3, Color.WHITE);
        assertTrue(pawn.canMove(3, 3));
    }

    @Test
    public void testPawnCannotMoveBackward() {
        Pawn pawn = new Pawn(3, 3, Color.WHITE);
        assertFalse(pawn.canMove(2, 3));
    }

    @Test
    public void testPawnKillDiagonal() {
        Pawn pawn = new Pawn(3, 3, Color.WHITE);
        Pawn enemy = new Pawn(4, 4, Color.BLACK);
        assertTrue(pawn.canKill(enemy));
    }

    @Test
    public void testPawnCannotKillForward() {
        Pawn pawn = new Pawn(3, 3, Color.WHITE);
        Pawn enemy = new Pawn(4, 3, Color.BLACK);
        assertFalse(pawn.canKill(enemy));
    }
}
