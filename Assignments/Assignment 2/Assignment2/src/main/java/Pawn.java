public class Pawn extends ChessPiece {

    public Pawn(int row, int column, Color color) {
        super(row, column, color);

        // Pawns cannot be created on the royal row
        if (color == Color.WHITE && row == 0) {
            throw new IllegalArgumentException("White pawn cannot be on row 0");
        }

        if (color == Color.BLACK && row == 7) {
            throw new IllegalArgumentException("Black pawn cannot be on row 7");
        }
    }

    @Override
    public boolean canMove(int row, int col) {

        // Pawn must move in the same column
        if (col != this.column) {
            return false;
        }

        int direction = (color == Color.WHITE) ? 1 : -1;

        // Normal one-step forward move
        if (row == this.row + direction) {
            return true;
        }

        // First move: two-step forward move
        if (color == Color.WHITE && this.row == 1 && row == 3) {
            return true;
        }

        if (color == Color.BLACK && this.row == 6 && row == 4) {
            return true;
        }

        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        if (piece == null || piece.getColor() == this.color) {
            return false;
        }

        int direction = (color == Color.WHITE) ? 1 : -1;

        // Pawn kills one step diagonally forward
        return piece.getRow() == this.row + direction &&
                Math.abs(piece.getColumn() - this.column) == 1;
    }
}