public class Rook extends ChessPiece {

    public Rook(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        if (row == this.row && col == this.column) {
            return false;
        }
        return row == this.row || col == this.column;
    }

}
