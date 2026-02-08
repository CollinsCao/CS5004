public class Queen extends ChessPiece {

    public Queen(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        int rowDiff = Math.abs(row - this.row);
        int colDiff = Math.abs(col - this.column);

        if (row == this.row && col == this.column) {
            return false;
        }

        return row == this.row ||
                col == this.column ||
                rowDiff == colDiff;
    }
}
